package fptu.sep490.commonlibrary.exception;

import fptu.sep490.commonlibrary.utils.MessagesUtils;

public class WrongEmailFormatException extends RuntimeException {

    private final String message;

    public WrongEmailFormatException(String errorCode, Object... var2) {
        this.message = MessagesUtils.getMessage(errorCode, var2);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
