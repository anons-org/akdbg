package constans.types.setInstructionBreakpoints;

import constans.Response;
import constans.meta.Breakpoint;
import constans.types.breakpointLocations.BreakpointLocationsResponse;

public class SetInstructionBreakpointsMessage extends Response {

    SetInstructionBreakpointsResponse response;
    SetInstructionBreakpointsArguments args;

    public SetInstructionBreakpointsResponse getResponse() {
        return response;
    }

    public void setResponse(SetInstructionBreakpointsResponse response) {
        this.response = response;
    }

    public SetInstructionBreakpointsArguments getArgs() {
        return args;
    }

    public void setArgs(SetInstructionBreakpointsArguments args) {
        this.args = args;
    }
}
