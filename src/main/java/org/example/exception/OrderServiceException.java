package org.example.exception;

public class OrderServiceException extends Exception {
    public OrderServiceException() {
    }

    public OrderServiceException(String message) {
        super(message);
    }
}
