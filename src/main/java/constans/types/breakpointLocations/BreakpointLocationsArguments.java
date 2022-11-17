package constans.types.breakpointLocations;

import constans.meta.Source;

public class BreakpointLocationsArguments {

    /** The source location of the breakpoints; either `source.path` or `source.reference` must be specified. */

    Source source;
    /** Start line of range to search possible breakpoint locations in. If only the line is specified, the request returns all possible locations in that line. */

    int line;
    /** Start position within `line` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no column is given, the first position in the start line is assumed. */

    int column;
    /** End line of range to search possible breakpoint locations in. If no end line is given, then the end line is assumed to be the start line. */

    int endLine;
    /** End position within `endLine` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no end column is given, the last position in the end line is assumed. */

    int endColumn;


}
