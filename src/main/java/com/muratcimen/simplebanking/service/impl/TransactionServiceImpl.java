package com.muratcimen.simplebanking.service.impl;

import com.muratcimen.simplebanking.model.dto.CreatePhoneBillPaymentRequestDto;
import com.muratcimen.simplebanking.model.entity.*;
import com.muratcimen.simplebanking.model.enums.TransactionType;
import com.muratcimen.simplebanking.repository.TransactionRepository;
import com.muratcimen.simplebanking.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    @Override
    public void deposit(Account account, double amount) {
        String approvalCode = UUID.randomUUID().toString();
        Transaction transaction = new DepositTransaction(amount);
        transaction.setAccount(account);
        transaction.setApprovalCode(approvalCode);
        transaction.setTransactionType(TransactionType.DEPOSIT);
        transactionRepository.save(transaction);
    }

    @Override
    public void withdrawal(Account account, double amount) {
        String approvalCode = UUID.randomUUID().toString();
        Transaction transaction = new WithdrawalTransaction(amount);
        transaction.setAccount(account);
        transaction.setApprovalCode(approvalCode);
        transaction.setTransactionType(TransactionType.WITHDRAW);
        transactionRepository.save(transaction);
    }

    @Override
    public void payment(Account account, CreatePhoneBillPaymentRequestDto createPhoneBillPaymentRequestDto) {
        String approvalCode = UUID.randomUUID().toString();
        Transaction transaction = new PhoneBillPaymentTransaction(createPhoneBillPaymentRequestDto.getAccountNumber(), createPhoneBillPaymentRequestDto.getPhoneNumber(), createPhoneBillPaymentRequestDto.getAmount());
        transaction.setAccount(account);
        transaction.setApprovalCode(approvalCode);
        transaction.setTransactionType(TransactionType.PHONE_BILL_PAYMENT);
        transactionRepository.save(transaction);
    }
}