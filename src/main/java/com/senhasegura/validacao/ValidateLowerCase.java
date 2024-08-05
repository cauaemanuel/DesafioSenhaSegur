package com.senhasegura.validacao;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.senhasegura.DTO.ValidationDTO;

@Component
public class ValidateLowerCase implements Validation {

    @Override
    public ValidationDTO validation(String password) {
        if (!Pattern.matches(".*[a-z].*", password)) {
            return new ValidationDTO(false, "A senha deve ter pelo menos um caractere minúsculo.");
        }
        return new ValidationDTO(true, "Senha passou.");
    }
}