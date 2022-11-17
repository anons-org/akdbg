package constans.types.breakpointLocations;

import constans.Response;
import constans.meta.Breakpoint;


public class BreakpointLocationsResponse extends Response {

    private BreakpointLocationsResponse.InnerData body;

    public static class InnerData {
        BreakpointLocation[] breakpoints;
    }

}
