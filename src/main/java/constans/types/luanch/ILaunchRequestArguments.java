package constans.types.luanch;

public class ILaunchRequestArguments extends LaunchRequestArguments{

    /** An absolute path to the "program" to debug. */


    public String program;

    /** Automatically stop target after launch. If not specified, target does not stop. */


    public boolean stopOnEntry;

    /** enable logging the Debug Adapter Protocol */


    public boolean trace;



    public Object debugHostProxy;

    /** if specified, results in a simulated compile error in launch. compileError?: 'default' | 'show' | 'hide'; */

    public  String compileError;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public boolean isStopOnEntry() {
        return stopOnEntry;
    }

    public void setStopOnEntry(boolean stopOnEntry) {
        this.stopOnEntry = stopOnEntry;
    }

    public boolean isTrace() {
        return trace;
    }

    public void setTrace(boolean trace) {
        this.trace = trace;
    }



    public Object getDebugHostProxy() {
        return debugHostProxy;
    }

    public void setDebugHostProxy(Object debugHostProxy) {
        this.debugHostProxy = debugHostProxy;
    }

    public String getCompileError() {
        return compileError;
    }

    public void setCompileError(String compileError) {
        this.compileError = compileError;
    }
}
