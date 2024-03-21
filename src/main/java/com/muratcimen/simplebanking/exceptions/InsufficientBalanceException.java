package com.muratcimen.simplebanking.exceptions;

public class InsufficientBalanceException  extends CustomRuntimeException {

    public InsufficientBalanceException(String code) {
        super(code);
    }
    public InsufficientBalanceException(String code, Object... userNameArgs) {
        super(code, userNameArgs);
    }
}
