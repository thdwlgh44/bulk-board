package com.portfolio.boardserver.exception;

public class DuplicatedException extends RuntimeException {

    public DuplicatedException(String msg) {
        super(msg);
    }
}
