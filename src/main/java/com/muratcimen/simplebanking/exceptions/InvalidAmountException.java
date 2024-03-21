package com.muratcimen.simplebanking.exceptions;

import com.muratcimen.simplebanking.exceptions.CustomRuntimeException;

public class InvalidAmountException extends CustomRuntimeException {

    public InvalidAmountException(String code) {
        super(code);
    }
    public InvalidAmountException(String code, Object... userNameArgs) {
        super(code, userNameArgs);
    }
}
