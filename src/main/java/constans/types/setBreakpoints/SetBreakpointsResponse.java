package constans.types.setBreakpoints;

import constans.Response;
import constans.meta.Breakpoint;

public class SetBreakpointsResponse extends Response {

    public static class InnerData{
        Breakpoint[] breakpoints;
    }


}
