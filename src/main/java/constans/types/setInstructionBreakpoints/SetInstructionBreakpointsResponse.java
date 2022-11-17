package constans.types.setInstructionBreakpoints;

import constans.Response;
import constans.meta.Breakpoint;
import constans.types.breakpointLocations.BreakpointLocation;
import constans.types.breakpointLocations.BreakpointLocationsResponse;

public class SetInstructionBreakpointsResponse extends Response {
    private BreakpointLocationsResponse.InnerData body;
    public static class InnerData {
        Breakpoint[] breakpoints;
    }
}
