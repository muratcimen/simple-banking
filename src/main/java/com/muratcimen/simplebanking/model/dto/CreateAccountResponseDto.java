package com.muratcimen.simplebanking.model.dto;

import com.muratcimen.simplebanking.model.entity.Transaction;

import java.time.LocalDateTime;
import java.util.List;

public class CreateAccountResponseDto {
    private String accountNumber;
    private String owner;
    private Double balance;
    private LocalDateTime createdDateTime;
    private List<Transaction> transactions;

    public CreateAccountResponseDto(String accountNumber, String owner, Double balance, LocalDateTime createdDateTime, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.createdDateTime = createdDateTime;
        this.transactions = transactions;
    }

    public CreateAccountResponseDto() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
