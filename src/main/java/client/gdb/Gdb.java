package client.gdb;

import client.ProcessClient;
import com.far.net.interf.IProcessAgent;
import constans.QuestPacket;
import constans.types.luanch.LaunchMessage;
import constans.types.next.NextMessage;
import constans.types.setBreakpoints.SetBreakpointsMessage;
import constans.types.setFunctionBreakPoints.SetFunctionBreakPointsMessage;
import helps.SessionManager;
import interf.IClient;

public class Gdb extends ProcessClient implements IClient {


    @Override
    public void onRequest(int type, String msg, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void launchRequest(LaunchMessage launchMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void setBreakPointsRequest(SetBreakpointsMessage launchMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void setFunctionBreakPointsRequest(SetFunctionBreakPointsMessage setFunctionBreakPointsMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }

    @Override
    public void nextRequest(NextMessage nextMessage, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }


    @Override
    public void threadsRequest(QuestPacket.Response response, QuestPacket.Args args, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {

    }
}
