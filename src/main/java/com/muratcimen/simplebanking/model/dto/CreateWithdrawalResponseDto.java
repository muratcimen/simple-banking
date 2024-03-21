package com.muratcimen.simplebanking.model.dto;

public class CreateWithdrawalResponseDto {
    private String owner;
    private String accountNumber;
    private double balance;

    public CreateWithdrawalResponseDto() {}

    public CreateWithdrawalResponseDto(String owner, String accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
