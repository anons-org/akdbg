package constans.meta;

public class SourceBreakpoint {

    /**
     * The source line of the breakpoint or logpoint.
     */

    public int line;
    /**
     * Start position within source line of the breakpoint or logpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */

    public int column;
    /**
     * The expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     */


    public String condition;
    /**
     * The expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     */


    public String hitCondition;

    /**
     * If this attribute exists and is non-empty, the debug adapter must not 'break' (stop)
     * but log the message instead. Expressions within `{}` are interpolated.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsLogPoints` is true.
     */


    public String logMessage;


    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getHitCondition() {
        return hitCondition;
    }

    public void setHitCondition(String hitCondition) {
        this.hitCondition = hitCondition;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }
}
