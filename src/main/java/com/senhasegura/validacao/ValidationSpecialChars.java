package com.senhasegura.validacao;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.senhasegura.DTO.ValidationDTO;

@Component
public class ValidationSpecialChars implements Validation {

	
	public ValidationDTO validation(String password) {
		if (!Pattern.matches(".*[!@#\\$%^&*()_+\\-=\\[\\]{};:\\\\,<>\\/?].*", password)) {
			return new ValidationDTO(false, "A senha deve conter pelo menos um caractere especial.");
		}
		return new ValidationDTO(true, "senha passou");
	}
	
}
