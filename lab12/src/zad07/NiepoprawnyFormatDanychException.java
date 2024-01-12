package zad07;

public class NiepoprawnyFormatDanychException extends Exception {
    public NiepoprawnyFormatDanychException() {
    }

    public NiepoprawnyFormatDanychException(String message) {
        super(message);
    }

    public NiepoprawnyFormatDanychException(String message, Throwable cause) {
        super(message, cause);
    }

    public NiepoprawnyFormatDanychException(Throwable cause) {
        super(cause);
    }

    public NiepoprawnyFormatDanychException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
