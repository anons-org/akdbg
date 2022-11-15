import client.gdb.Gdb;
import client.rhino.Rhino;
import com.far.net.interf.IProcessAgent;
import com.far.net.interf.IProcessHandler;
import com.far.net.server.core.FarSockServer;
import com.far.net.server.handler.FarSockChannelHandler;
import com.far.net.server.session.Session;
import helps.SessionManager;
import interf.IClient;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;


public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    private static SessionManager sessionManager;

    static {
        sessionManager = new SessionManager();
    }


    public static void main(String[] args) {


        IProcessHandler<Object> iProcessHandler = new IProcessHandler<Object>() {
            @Override
            public IProcessAgent<Object> onOpen(Session e) {
                //自行管理连接
                sessionManager.addSeesion(e);
                return null;
            }

            @Override
            public void onClose(IProcessAgent<Object> e) {

            }

            @Override
            public void onMessage(IProcessAgent<Object> e, String message) {

            }

            @Override
            public void onMessage(String id, ByteBuf byteBuf) {
                //这儿是socket的处理
                //由于包头占了4字节，实际上此处收到的Buffer 已经不包含包头的数据了...
                int length = byteBuf.readableBytes();
                //读取类型
                int questType = byteBuf.readInt();
                //读取报文内容
                byte[] bytes = new byte[length - 4];
                byteBuf.readBytes(bytes, 0, length - 4);
                String request = new String(bytes, StandardCharsets.UTF_8);
                String info = String.format("数据长度:%s,数据类型:%d  报文:%s", length, questType, request);
                logger.info(info);

                IProcessAgent<SessionManager.SessionAgent> sessionAgent =  sessionManager.getSesssionAgent(id);

                IClient client = new Rhino();
                client.onRequest(questType,request,sessionAgent);

            }


            @Override
            public void onNetInitComplete(IProcessAgent<Object> e) {

            }

            @Override
            public void onError(IProcessAgent<Object> e) {

            }

            @Override
            public void onClose(String id) {
                sessionManager.removeSessionAgent(id);
            }

            @Override
            public void onMessage(String id, String message) {

            }

            @Override
            public void onNetInitComplete(Session e) {

            }

            @Override
            public void onError(String id) {
                sessionManager.removeSessionAgent(id);
            }
        };

        FarSockServer farSockServer =  new FarSockServer("127.0.0.1", 1234, "", new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {

                //https://blog.csdn.net/crazymakercircle/article/details/86561603  LengthFieldBasedFrameDecoder
                //http://t.zoukankan.com/caoweixiong-p-14666400.html

                            /*
                            LengthFieldBasedFrameDecoder+LengthFieldPrepender自定义消息长度
                            LengthFieldPrepender对自定义消息长度进行编码。
                            LengthFieldBasedFrameDecoder对自定义消息长度进行解码。
                            LengthFieldBasedFrameDecoder的构造方法如下：
                                public LengthFieldBasedFrameDecoder(ByteOrder byteOrder, int maxFrameLength, int lengthFieldOffset, int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip, boolean failFast) {
                                参数说明：

                                byteOrder：数据存储采用大端模式或小端模式
                                maxFrameLength：发送的数据帧最大长度
                                lengthFieldOffset： 发送的字节数组中从下标lengthFieldOffset开始存放的是报文数据的长度。
                                lengthFieldLength： 在发送的字节数组中，报文数据的长度占几位，也就是字节数组bytes[lengthFieldOffset, lengthFieldOffset+lengthFieldLength]存放的是报文数据的长度
                                lengthAdjustment： 长度域的偏移量矫正。如果长度域的值，除了包含有效数据域的长度外，还包含了其他域（如长度域自身）长度，那么，就需要进行矫正。矫正的值为：包长-长度域的值-长度域偏移 – 长度域长。
                                initialBytesToStrip：接收到的发送数据包，去除前initialBytesToStrip位
                                failFast：为true表示读取到长度域超过maxFrameLength，就抛出一个TooLongFrameException。为false表示只有真正读取完长度域的值表示的字节之后，才会抛出TooLongFrameException，默认情况下设置为true，建议不要修改，否则可能会造成内存溢出。
                            */

                socketChannel.pipeline().addLast(
                        new LengthFieldBasedFrameDecoder(
                                ByteOrder.BIG_ENDIAN,//字节序
                                2 * 1024,
                                0,
                                4,
                                -4,//补偿
                                4,
                                true
                        )
                );

                socketChannel.pipeline().addLast(new LengthFieldPrepender(4));
                socketChannel.pipeline().addLast(new FarSockChannelHandler().setProcessHandler(iProcessHandler));
            }
        });


        farSockServer.start();

    }
}


