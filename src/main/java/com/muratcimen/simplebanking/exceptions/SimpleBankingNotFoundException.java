package com.muratcimen.simplebanking.exceptions;

public class SimpleBankingNotFoundException extends RuntimeException {
    public SimpleBankingNotFoundException(String message) {
        super(message);
    }
}
