package interf;

import com.far.net.interf.IProcessAgent;
import constans.QuestPacket;
import constans.Request;
import constans.types.luanch.LaunchMessage;
import constans.types.next.NextMessage;
import constans.types.setBreakpoints.SetBreakpointsMessage;
import constans.types.setFunctionBreakPoints.SetFunctionBreakPointsMessage;
import helps.SessionManager;

public interface IClient {

    public void onRequest(int type, String msg, IProcessAgent<SessionManager.SessionAgent> sessionAgent);

    public void launchRequest(LaunchMessage launchMessage,IProcessAgent<SessionManager.SessionAgent> sessionAgent);

    public void setBreakPointsRequest(SetBreakpointsMessage launchMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent);

    public void setFunctionBreakPointsRequest(SetFunctionBreakPointsMessage setFunctionBreakPointsMessage,IProcessAgent<SessionManager.SessionAgent> sessionAgent);


    public void nextRequest(NextMessage nextMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent);
    public void threadsRequest(QuestPacket.Response response, QuestPacket.Args args, IProcessAgent<SessionManager.SessionAgent> sessionAgent);
}
