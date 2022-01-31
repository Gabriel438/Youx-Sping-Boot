package com.spring.youx.exception;

public class CustomException extends RuntimeException {
    public CustomException() {
        super("Usuário não encontrado!");
    }
}