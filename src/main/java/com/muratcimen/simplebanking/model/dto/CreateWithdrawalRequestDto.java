package com.muratcimen.simplebanking.model.dto;


public class CreateWithdrawalRequestDto {
    private String accountNumber;
    private double amount;

    public CreateWithdrawalRequestDto() {}

    public CreateWithdrawalRequestDto(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
