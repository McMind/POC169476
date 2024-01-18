package zad4;

public class ValueTooHighException extends Exception {
    public ValueTooHighException() {
        super();
    }

    public ValueTooHighException(String message) {
        super(message);
    }

    public ValueTooHighException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueTooHighException(Throwable cause) {
        super(cause);
    }

    protected ValueTooHighException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
