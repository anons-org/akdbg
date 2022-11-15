package constans.types.setBreakpoints;

import constans.meta.Source;
import constans.meta.SourceBreakpoint;

public class SetBreakpointsArguments {

    /**
     * The source location of the breakpoints; either `source.path` or `source.sourceReference` must be specified.
     */

    public Source source;

    /**
     * The code locations of the breakpoints.
     */

    public SourceBreakpoint[] breakpoints;

    /**
     * Deprecated: The code locations of the breakpoints.
     */


    public int[] lines;

    /**
     * A value of true indicates that the underlying source has been modified which results in new breakpoint locations.
     */

    public boolean sourceModified;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public SourceBreakpoint[] getBreakpoints() {
        return breakpoints;
    }

    public void setBreakpoints(SourceBreakpoint[] breakpoints) {
        this.breakpoints = breakpoints;
    }

    public int[] getLines() {
        return lines;
    }

    public void setLines(int[] lines) {
        this.lines = lines;
    }

    public boolean isSourceModified() {
        return sourceModified;
    }

    public void setSourceModified(boolean sourceModified) {
        this.sourceModified = sourceModified;
    }
}
