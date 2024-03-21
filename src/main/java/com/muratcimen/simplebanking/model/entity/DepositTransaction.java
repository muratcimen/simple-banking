package com.muratcimen.simplebanking.model.entity;

import com.muratcimen.simplebanking.model.entity.Transaction;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class DepositTransaction extends Transaction {
    public DepositTransaction(double amount) {
        super(amount);
    }

    public DepositTransaction(double amount, String approvalCode) {
        super(amount,approvalCode);
    }
}
