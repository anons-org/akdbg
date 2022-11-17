package constans.types.breakpointLocations;

import constans.Request;
import constans.types.setBreakpoints.SetBreakpointsArguments;
import constans.types.setFunctionBreakPoints.SetFunctionBreakpointsResponse;

public class BreakPointLocationMessage {
    BreakpointLocation response;
    BreakpointLocationsArguments args;
    Request request;


    public BreakpointLocation getResponse() {
        return response;
    }

    public void setResponse(BreakpointLocation response) {
        this.response = response;
    }

    public BreakpointLocationsArguments getArgs() {
        return args;
    }

    public void setArgs(BreakpointLocationsArguments args) {
        this.args = args;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
