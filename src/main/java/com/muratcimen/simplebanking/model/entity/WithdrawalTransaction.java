package com.muratcimen.simplebanking.model.entity;

import com.muratcimen.simplebanking.model.entity.Transaction;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class WithdrawalTransaction extends Transaction {
    public WithdrawalTransaction(double amount) {
        super(amount);
    }
}
