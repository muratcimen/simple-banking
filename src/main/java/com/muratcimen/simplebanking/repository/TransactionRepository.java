package com.muratcimen.simplebanking.repository;

import com.muratcimen.simplebanking.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
