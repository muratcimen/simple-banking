package com.muratcimen.simplebanking.service;

import com.muratcimen.simplebanking.model.dto.CreatePhoneBillPaymentRequestDto;
import com.muratcimen.simplebanking.model.entity.Account;

public interface TransactionService {
    void deposit(Account account, double amount);

    void withdrawal(Account account, double amount);

    void payment(Account account, CreatePhoneBillPaymentRequestDto createPhoneBillPaymentRequestDto);
}
