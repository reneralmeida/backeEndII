package com.movie.catalog.exception;

public class CircuitBreakerException extends Exception{

    public CircuitBreakerException(String msg) {
        super(msg);
    }
}
