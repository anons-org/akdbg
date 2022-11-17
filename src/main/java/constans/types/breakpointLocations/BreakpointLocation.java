package constans.types.breakpointLocations;

public class BreakpointLocation {

    /** Start line of breakpoint location. */

    int line;

    /** The start position of a breakpoint location. Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. */

    int column;
    /** The end line of breakpoint location if the location covers a range. */

    int endLine;
    /** The end position of a breakpoint location (if the location covers a range). Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. */

    int endColumn;

}
