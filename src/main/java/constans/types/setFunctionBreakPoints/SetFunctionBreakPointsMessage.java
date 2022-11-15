package constans.types.setFunctionBreakPoints;

import constans.Request;
import constans.types.setBreakpoints.SetBreakpointsArguments;

public class SetFunctionBreakPointsMessage {
    SetFunctionBreakpointsResponse response;
    SetBreakpointsArguments args;
    Request request;

    public SetFunctionBreakpointsResponse getResponse() {
        return response;
    }

    public void setResponse(SetFunctionBreakpointsResponse response) {
        this.response = response;
    }

    public SetBreakpointsArguments getArgs() {
        return args;
    }

    public void setArgs(SetBreakpointsArguments args) {
        this.args = args;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
