package constans.types.setFunctionBreakPoints;

import constans.Response;
import constans.meta.Breakpoint;

public class SetFunctionBreakpointsResponse extends Response {

    private InnerData body;

    public static class InnerData{
        Breakpoint[] breakpoints;
    }


    public InnerData getBody() {
        return body;
    }

    public void setBody(InnerData body) {
        this.body = body;
    }
}
