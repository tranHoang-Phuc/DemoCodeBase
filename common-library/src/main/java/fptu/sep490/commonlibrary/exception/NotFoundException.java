package fptu.sep490.commonlibrary.exception;

import fptu.sep490.commonlibrary.utils.MessagesUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotFoundException extends RuntimeException {
    private  String message;

    public NotFoundException(String errorCode, Object... var2) {
        System.out.println("NotFoundException errorCode: " + errorCode); // Debug

        try {
            this.message = MessagesUtils.getMessage(errorCode, var2);
            log.error(this.message);
        } catch (Exception e) {
            e.printStackTrace();

        log.error(e.getMessage());
  }
    }

    @Override
    public String getMessage() {
        return message;
    }
}

