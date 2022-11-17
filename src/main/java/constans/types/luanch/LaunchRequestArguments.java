package constans.types.luanch;

public class LaunchRequestArguments {
    /** If true, the launch request should launch the program without enabling debugging. */

   public boolean  noDebug;


    /** Arbitrary data from the previous, restarted session.
     The data is sent as the `restart` attribute of the `terminated` event.
     The client should leave the data intact.
     */

    public String request;

    public String __sessionId;

    public  Object __restart;

    public String __configurationTarget;

    public String name;

    public String type;

    public boolean isNoDebug() {
        return noDebug;
    }

    public void setNoDebug(boolean noDebug) {
        this.noDebug = noDebug;
    }

    public Object get__restart() {
        return __restart;
    }

    public void set__restart(Object __restart) {
        this.__restart = __restart;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String get__sessionId() {
        return __sessionId;
    }

    public void set__sessionId(String __sessionId) {
        this.__sessionId = __sessionId;
    }

    public String get__configurationTarget() {
        return __configurationTarget;
    }

    public void set__configurationTarget(String __configurationTarget) {
        this.__configurationTarget = __configurationTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
