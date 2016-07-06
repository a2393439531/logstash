package org.logstash.ackedqueue;

public class QueueRuntimeException extends RuntimeException {
    public QueueRuntimeException() {
    }

    public QueueRuntimeException(String message) {
        super(message);
    }

    public QueueRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueRuntimeException(Throwable cause) {
        super(cause);
    }

    public QueueRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
