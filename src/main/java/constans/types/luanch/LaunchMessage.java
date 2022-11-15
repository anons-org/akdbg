package constans.types.luanch;

public class LaunchMessage {
    private LaunchResponse response;
    private ILaunchRequestArguments args;

    public LaunchResponse getResponse() {
        return response;
    }

    public void setResponse(LaunchResponse response) {
        this.response = response;
    }

    public ILaunchRequestArguments getArgs() {
        return args;
    }

    public void setArgs(ILaunchRequestArguments args) {
        this.args = args;
    }
}
