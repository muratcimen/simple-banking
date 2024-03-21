package com.muratcimen.simplebanking.mapper;

import com.muratcimen.simplebanking.model.dto.*;
import com.muratcimen.simplebanking.model.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account createAccountRequestDtoToAccount(CreateAccountRequestDto createAccountRequestDto);

    CreateAccountResponseDto createAccountToCreateAccountResponseDto(Account account);

    Account createCreditRequestDtoToAccount(CreateCreditRequestDto createCreditRequestDto);

    CreateCreditResponseDto createAccountToCreateCreditResponseDto(Account account);

    Account createWithdrawalRequestDtoToAccount(CreateWithdrawalRequestDto createWithdrawalRequestDto);

    CreateWithdrawalResponseDto createAccountToCreateWithdrawalResponseDto(Account account);

    Account createPhoneBillPaymentRequestDtoToAccount(CreatePhoneBillPaymentRequestDto createPhoneBillPaymentRequestDto);

    CreatePhoneBillPaymentResponseDto createAccountToCreatePhoneBillPaymentResponseDto(Account account);
}
