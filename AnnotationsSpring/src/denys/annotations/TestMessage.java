package denys.annotations;

public class TestMessage {
    private String  message;

    void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message: " + message;
    }
}
