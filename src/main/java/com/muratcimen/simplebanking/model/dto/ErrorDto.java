package com.muratcimen.simplebanking.model.dto;

import java.io.Serializable;

public class ErrorDto implements Serializable {
    private String message;
    private String field;
    private String code;

    public ErrorDto() {}

    public ErrorDto(String message, String field, String code) {
        this.message = message;
        this.field = field;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
