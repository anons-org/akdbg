package constans;

public class Response extends ProtocolMessage{



    // type: 'response';
    /**
     * Sequence number of the corresponding request.
     */

    public int request_seq;
    /**
     * Outcome of the request.
     * If true, the request was successful and the `body` attribute may contain the result of the request.
     * If the value is false, the attribute `message` contains the error in short form and the `body` may contain additional information (see `ErrorResponse.body.error`).
     */

    public boolean success;
    /**
     * The command requested.
     */
    public String command;
    /**
     * Contains the raw error in short form if `success` is false.
     * This raw error might be interpreted by the client and is not shown in the UI.
     * Some predefined values exist.
     * Values:
     * 'cancelled': request was cancelled.
     * etc.
     */
    public String message;
    /**
     * Contains request result if success is true and error details if success is false.
     */



    public int getRequest_seq() {
        return request_seq;
    }

    public void setRequest_seq(int request_seq) {
        this.request_seq = request_seq;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
