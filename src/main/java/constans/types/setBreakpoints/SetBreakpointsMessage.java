package constans.types.setBreakpoints;

public class SetBreakpointsMessage {


    SetBreakpointsResponse response;
    SetBreakpointsArguments args;

    public SetBreakpointsResponse getResponse() {
        return response;
    }

    public void setResponse(SetBreakpointsResponse response) {
        this.response = response;
    }

    public SetBreakpointsArguments getArgs() {
        return args;
    }

    public void setArgs(SetBreakpointsArguments args) {
        this.args = args;
    }
}
