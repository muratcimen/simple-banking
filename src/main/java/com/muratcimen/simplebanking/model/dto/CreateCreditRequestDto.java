package com.muratcimen.simplebanking.model.dto;


public class CreateCreditRequestDto {
    private String accountNumber;
    private double amount;

    public CreateCreditRequestDto() {}

    public CreateCreditRequestDto(String accountNumber, double amount) {
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

    public boolean isAccountNumberNotBlank() {
        return accountNumber != null && !accountNumber.trim().isEmpty();
    }

    public boolean isAmountNotNull() {
        return Double.compare(amount, 0.0) != 0;
    }
}
