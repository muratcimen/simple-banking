package com.muratcimen.simplebanking.exceptions.handler;

import com.muratcimen.simplebanking.exceptions.CustomRuntimeException;
import com.muratcimen.simplebanking.exceptions.InsufficientBalanceException;
import com.muratcimen.simplebanking.exceptions.InvalidAmountException;
import com.muratcimen.simplebanking.model.dto.ErrorDto;
import com.muratcimen.simplebanking.model.dto.ServiceResultDto;
import com.muratcimen.simplebanking.model.dto.ServiceResultStatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.security.auth.login.AccountNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ServiceResultDto<Void>> handleAccountNotFoundException(AccountNotFoundException e) {
        logger.error("Hesap bulunamadı: " + e.getMessage(), e); // Loglama
        ErrorDto error = new ErrorDto(
                "Aradığınız hesap bulunamadı.", // Özel hata mesajı
                null, // Field bilgisi, isteğe bağlı olarak null olabilir veya bir alan adı atanabilir
                "ACCOUNT_NOT_FOUND"); // Özel hata kodu
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ServiceResultDto<>(error, ServiceResultStatusCode.ACCOUNT_NOT_FOUND));
    }

    @ExceptionHandler(InvalidAmountException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ServiceResultDto<Void>> handleInvalidAmountException(InvalidAmountException e) {
        ErrorDto error = new ErrorDto(
                e.getMessage(), // Özel hata mesajı
                null, // Field bilgisi, isteğe bağlı olarak null olabilir veya bir alan adı atanabilir
                "INVALID_AMOUNT"); // Özel hata kodu
        return ResponseEntity.status(HttpStatus.OK).body(new ServiceResultDto<>(error, ServiceResultStatusCode.INVALID_AMOUNT));
    }

    @ExceptionHandler(InsufficientBalanceException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ServiceResultDto<Void>> handleInsufficientBalanceException(InsufficientBalanceException e) {
        ErrorDto error = new ErrorDto(
                e.getMessage(), // Özel hata mesajı
                null, // Field bilgisi, isteğe bağlı olarak null olabilir veya bir alan adı atanabilir
                "INSUFFICIENT_BALANCE"); // Özel hata kodu
        return ResponseEntity.status(HttpStatus.OK).body(new ServiceResultDto<>(error, ServiceResultStatusCode.INSUFFICIENT_BALANCE));
    }

    @ExceptionHandler(CustomRuntimeException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ServiceResultDto<Void>> handleCustomRuntimeException(CustomRuntimeException e) {
        ErrorDto error = new ErrorDto(
                e.getMessage(), // Özel hata mesajı
                null, // Field bilgisi, isteğe bağlı olarak null olabilir veya bir alan adı atanabilir
                "CUSTOM_RUNTIME_EXCEPTION"); // Özel hata kodu
        return ResponseEntity.status(HttpStatus.OK).body(new ServiceResultDto<>(error, ServiceResultStatusCode.CUSTOM_RUNTIME_EXCEPTION));
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ServiceResultDto<Void>> handleGeneralException(Exception e) {
        logger.error("Beklenmeyen bir hata oluştu: " + e.getMessage(), e); // Loglama
        ErrorDto error = new ErrorDto(
                "Beklenmeyen bir hata oluştu.", // Özel hata mesajı
                null, // Field bilgisi, isteğe bağlı olarak null olabilir veya bir alan adı atanabilir
                "INTERNAL_SERVER_ERROR"); // Özel hata kodu
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ServiceResultDto<>(error, ServiceResultStatusCode.INTERNAL_SERVER_ERROR));
    }
}
