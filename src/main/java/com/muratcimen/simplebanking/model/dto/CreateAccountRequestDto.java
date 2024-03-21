package com.muratcimen.simplebanking.model.dto;

public class CreateAccountRequestDto {
    private String owner;

    public CreateAccountRequestDto() {}

    public CreateAccountRequestDto(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isOwnerNotBlank() {
        return owner != null && !owner.trim().isEmpty();
    }

    public boolean isOwnerNotNull() {
        return owner != null;
    }
}
