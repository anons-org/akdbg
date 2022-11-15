package constans.meta;



public class Breakpoint{

    /** The identifier for the breakpoint. It is needed if breakpoint events are used to update or remove breakpoints. */

    int id;
    /** If true, the breakpoint could be set (but not necessarily at the desired location). */

    boolean verified;
    /** A message about the state of the breakpoint.
     This is shown to the user and can be used to explain why a breakpoint could not be verified.
     */

    String message;

    /** The source where the breakpoint is located. */

    Source  source;
    /** The start line of the actual range covered by the breakpoint. */

    int line;
    /** Start position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. */

    int column;

    /** The end line of the actual range covered by the breakpoint. */


    int endLine;
    /** End position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     If no end line is given, then the end column is assumed to be in the start line.
     */

    int endColumn;
    /** A memory reference to where the breakpoint is set. */

    String instructionReference;
    /** The offset from the instruction reference.
     This can be negative.
     */

    int offset;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

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

    public int getEndLine() {
        return endLine;
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public int getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(int endColumn) {
        this.endColumn = endColumn;
    }

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
}
