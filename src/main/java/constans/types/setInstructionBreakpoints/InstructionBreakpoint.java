package constans.types.setInstructionBreakpoints;

public class InstructionBreakpoint {
    /** The instruction reference of the breakpoint.
     This should be a memory or instruction pointer reference from an `EvaluateResponse`, `Variable`, `StackFrame`, `GotoTarget`, or `Breakpoint`.
     */

     String instructionReference;

    /** The offset from the instruction reference.
     This can be negative.
     */

    int offset;

    /** An expression for conditional breakpoints.
     It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     */


    String condition;
    /** An expression that controls how many hits of the breakpoint are ignored.
     The debug adapter is expected to interpret the expression as needed.
     The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     */
    String hitCondition;

    public String getInstructionReference() {
        return instructionReference;
    }

    public void setInstructionReference(String instructionReference) {
        this.instructionReference = instructionReference;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
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
}
