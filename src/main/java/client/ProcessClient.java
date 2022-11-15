package client;

import com.alibaba.fastjson.JSON;
import com.far.net.interf.IProcessAgent;
import constans.QuestType;
import constans.types.luanch.LaunchMessage;
import constans.types.next.NextMessage;
import constans.types.setBreakpoints.SetBreakpointsMessage;
import constans.types.setFunctionBreakPoints.SetFunctionBreakPointsMessage;
import helps.SessionManager;
import interf.IClient;

public class ProcessClient {

    public void evalQuest(int type, String msg, IClient iClient, IProcessAgent<SessionManager.SessionAgent> sessionAgent) {


        switch (type) {
            case QuestType.launchRequest -> {
                LaunchMessage launchMessage = JSON.parseObject(msg, LaunchMessage.class);
                iClient.launchRequest(launchMessage, sessionAgent);
            }
            case QuestType.setBreakPointsRequest -> {
                SetBreakpointsMessage setBreakpointsMessage = JSON.parseObject(msg, SetBreakpointsMessage.class);
                iClient.setBreakPointsRequest(setBreakpointsMessage, sessionAgent);
            }

            case QuestType.setFunctionBreakPointsRequest -> {
                SetFunctionBreakPointsMessage setFunctionBreakPointsMessage = JSON.parseObject(msg, SetFunctionBreakPointsMessage.class);
                iClient.setFunctionBreakPointsRequest(setFunctionBreakPointsMessage, sessionAgent);
            }


            case QuestType.nextRequest -> {
                NextMessage nextMessage = JSON.parseObject(msg, NextMessage.class);
                iClient.nextRequest(nextMessage, sessionAgent);
            }
            case QuestType.connect -> {

            }
            case QuestType.breakpointLocationsRequest -> {

            }
            case QuestType.cancelRequest -> {

            }
            case QuestType.completionsRequest -> {

            }
            case QuestType.continueRequest -> {

            }
            case QuestType.customRequest -> {

            }
            case QuestType.dataBreakpointInfoRequest -> {

            }
            case QuestType.disassembleRequest -> {

            }
            case QuestType.disconnectRequest -> {

            }
        }


    }


}
