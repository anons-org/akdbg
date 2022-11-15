package constans;

/*
 * @description: TODO
 * @author mike/Fang.J
    请求包
*/
public class QuestPacket {


    /**
     * response : {"seq":0,"type":"response","request_seq":2,"command":"launch","success":true}
     * args : {"type":"mock","request":"launch","name":"Debug readme.md","program":"E:\\AAAA_CODE\\vscode\\vscode-mock-debug\\sampleWorkspace/test.js","stopOnEntry":true,"trace":false,"debugHostProxy":{"ip":"127.0.0.1","port":1234},"__configurationTarget":6,"__sessionId":"61cba6c2-90fd-45f5-90cf-9c36adab42ee"}
     */

    private Response response;
    private Args args;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Args getArgs() {
        return args;
    }

    public void setArgs(Args args) {
        this.args = args;
    }

    public static class Response {
        /**
         * seq : 0
         * type : response
         * request_seq : 2
         * command : launch
         * success : true
         */

        private int seq;
        private String type;
        private int request_seq;
        private String command;
        private boolean success;

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getRequest_seq() {
            return request_seq;
        }

        public void setRequest_seq(int request_seq) {
            this.request_seq = request_seq;
        }

        public String getCommand() {
            return command;
        }

        public void setCommand(String command) {
            this.command = command;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }
    }

    public static class Args {
        /**
         * type : mock
         * request : launch
         * name : Debug readme.md
         * program : E:\AAAA_CODE\vscode\vscode-mock-debug\sampleWorkspace/test.js
         * stopOnEntry : true
         * trace : false
         * debugHostProxy : {"ip":"127.0.0.1","port":1234}
         * __configurationTarget : 6
         * __sessionId : 61cba6c2-90fd-45f5-90cf-9c36adab42ee
         */

        private String type;
        private String request;
        private String name;
        private String program;
        private boolean stopOnEntry;
        private boolean trace;
        private DebugHostProxyBean debugHostProxy;
        private int __configurationTarget;
        private String __sessionId;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRequest() {
            return request;
        }

        public void setRequest(String request) {
            this.request = request;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

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

        public DebugHostProxyBean getDebugHostProxy() {
            return debugHostProxy;
        }

        public void setDebugHostProxy(DebugHostProxyBean debugHostProxy) {
            this.debugHostProxy = debugHostProxy;
        }

        public int get__configurationTarget() {
            return __configurationTarget;
        }

        public void set__configurationTarget(int __configurationTarget) {
            this.__configurationTarget = __configurationTarget;
        }

        public String get__sessionId() {
            return __sessionId;
        }

        public void set__sessionId(String __sessionId) {
            this.__sessionId = __sessionId;
        }

        public static class DebugHostProxyBean {
            /**
             * ip : 127.0.0.1
             * port : 1234
             */

            private String ip;
            private int port;

            public String getIp() {
                return ip;
            }

            public void setIp(String ip) {
                this.ip = ip;
            }

            public int getPort() {
                return port;
            }

            public void setPort(int port) {
                this.port = port;
            }
        }
    }
}
