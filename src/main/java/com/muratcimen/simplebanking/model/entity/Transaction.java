package com.muratcimen.simplebanking.model.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.muratcimen.simplebanking.model.base.BaseEntity;
import com.muratcimen.simplebanking.model.enums.TransactionType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Transaction extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "approval_code")
    private String approvalCode;

    @Column(name = "transaction_type", updatable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;

    public Transaction(double amount) {
        this.amount = amount;
        super.setCreatedDateTime(LocalDateTime.now());
    }
    public Transaction(double amount, String approvalCode) {
        this.amount = amount;
        this.approvalCode = approvalCode;
        super.setCreatedDateTime(LocalDateTime.now());
    }
}
