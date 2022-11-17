package client;

import com.alibaba.fastjson.JSON;
import com.far.net.interf.IProcessAgent;
import constans.QuestType;
import constans.types.breakpointLocations.BreakPointLocationMessage;
import constans.types.luanch.LaunchMessage;
import constans.types.next.NextMessage;
import constans.types.setBreakpoints.SetBreakpointsMessage;
import constans.types.setFunctionBreakPoints.SetFunctionBreakPointsMessage;
import constans.types.setInstructionBreakpoints.SetInstructionBreakpointsMessage;
import helps.SessionManager;
import interf.IClient;

public class ProcessClient {

    public void evalQuest(int type, String msg, IClient iClient, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {


        switch (type) {
            case QuestType.launchRequest:
                LaunchMessage launchMessage = JSON.parseObject(msg, LaunchMessage.class);
                iClient.launchRequest(launchMessage, sessionAgent);
                break;
            case QuestType.setBreakPointsRequest:
                SetBreakpointsMessage setBreakpointsMessage = JSON.parseObject(msg, SetBreakpointsMessage.class);
                iClient.setBreakPointsRequest(setBreakpointsMessage, sessionAgent);
                break;
            case QuestType.setFunctionBreakPointsRequest:
                SetFunctionBreakPointsMessage setFunctionBreakPointsMessage = JSON.parseObject(msg, SetFunctionBreakPointsMessage.class);
                iClient.setFunctionBreakPointsRequest(setFunctionBreakPointsMessage, sessionAgent);
                break;
            case QuestType.nextRequest:
                NextMessage nextMessage = JSON.parseObject(msg, NextMessage.class);
                iClient.nextRequest(nextMessage, sessionAgent);
                break;
            case QuestType.breakpointLocationsRequest:
                BreakPointLocationMessage breakPointLocationMessage = JSON.parseObject(msg, BreakPointLocationMessage.class);
                iClient.breakpointLocationsRequest(breakPointLocationMessage, sessionAgent);

            case QuestType.setInstructionBreakpointsRequest:
                SetInstructionBreakpointsMessage setInstructionBreakpointsMessage = JSON.parseObject(msg, SetInstructionBreakpointsMessage.class);
                iClient.setInstructionBreakpointsRequest(setInstructionBreakpointsMessage, sessionAgent);

            default:
        }


    }


}
