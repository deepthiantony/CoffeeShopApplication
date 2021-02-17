package org.example.exception;

public class BillException extends Exception {
    public BillException(String message) {
        super(message);
    }

    public BillException(String message, Throwable cause) {
        super(message, cause);
    }
}
