package com.muratcimen.simplebanking.service;

import com.muratcimen.simplebanking.model.dto.*;

public interface AccountService {
    CreateAccountResponseDto createAccount(CreateAccountRequestDto createAccountRequestDto);

    CreateCreditResponseDto credit(CreateCreditRequestDto createCreditRequestDto);

    CreateWithdrawalResponseDto debit(CreateWithdrawalRequestDto createWithdrawalRequestDto);

    CreatePhoneBillPaymentResponseDto payment(CreatePhoneBillPaymentRequestDto createPhoneBillPaymentRequestDto);

    CreateAccountResponseDto getByAccountNumber(String accountNumber);
}
