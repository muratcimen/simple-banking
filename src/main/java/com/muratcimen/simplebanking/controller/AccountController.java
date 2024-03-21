package com.muratcimen.simplebanking.controller;


import com.muratcimen.annotations.RateLimited;
import com.muratcimen.simplebanking.model.dto.*;
import com.muratcimen.simplebanking.service.AccountService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
@AllArgsConstructor
@Validated
public class AccountController {
    private AccountService accountService;

    @PostMapping("/create")
    public CreateAccountResponseDto createAccount(@RequestBody @Valid CreateAccountRequestDto createAccountRequestDto) {
        return accountService.createAccount(createAccountRequestDto);
    }

    @GetMapping("/{accountNumber}")
    public CreateAccountResponseDto getByAccountNumber(@PathVariable("accountNumber") String accountNumber){
        return accountService.getByAccountNumber(accountNumber);
    }
    @RateLimited
    @PostMapping("/credit")
    public CreateCreditResponseDto credit(@RequestBody @Valid CreateCreditRequestDto createCreditRequestDto) {
        return accountService.credit(createCreditRequestDto);
    }
    @RateLimited
    @PostMapping("/debit")
    public CreateWithdrawalResponseDto debit(@RequestBody @Valid CreateWithdrawalRequestDto createWithdrawalRequestDto) {
        return accountService.debit(createWithdrawalRequestDto);
    }

    @RateLimited
    @PostMapping("/payment")
    public CreatePhoneBillPaymentResponseDto payment(@RequestBody @Valid CreatePhoneBillPaymentRequestDto createPhoneBillPaymentRequestDto) {
        return accountService.payment(createPhoneBillPaymentRequestDto);
    }
}
