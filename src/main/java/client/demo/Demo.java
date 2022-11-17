package client.demo;

import client.ProcessClient;
import com.far.net.interf.IProcessAgent;
import constans.QuestPacket;
import constans.types.breakpointLocations.BreakPointLocationMessage;
import constans.types.luanch.LaunchMessage;
import constans.types.next.NextMessage;
import constans.types.setBreakpoints.SetBreakpointsMessage;
import constans.types.setFunctionBreakPoints.SetFunctionBreakPointsMessage;
import constans.types.setInstructionBreakpoints.SetInstructionBreakpointsMessage;
import helps.SessionManager;
import interf.IClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo extends ProcessClient implements IClient {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Override
    public void onRequest(int type, String msg, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {
        this.evalQuest(type, msg, this, sessionAgent);
    }

    @Override
    public void launchRequest(LaunchMessage launchMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

       // sessionAgent.sendMessage(JSON.toJSONString(response));

        //需要修改response 的Body


    }

    @Override
    public void setBreakPointsRequest(SetBreakpointsMessage launchMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void setFunctionBreakPointsRequest(SetFunctionBreakPointsMessage setFunctionBreakPointsMessage,  IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void breakpointLocationsRequest(BreakPointLocationMessage breakPointLocationMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void setInstructionBreakpointsRequest(SetInstructionBreakpointsMessage setInstructionBreakpointsMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void nextRequest(NextMessage nextMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void threadsRequest(QuestPacket.Response response, QuestPacket.Args args, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }


}
