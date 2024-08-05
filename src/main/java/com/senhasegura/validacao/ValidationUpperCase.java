package com.senhasegura.validacao;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.senhasegura.DTO.ValidationDTO;

@Component
public class ValidationUpperCase implements Validation {

	public ValidationDTO validation(String password) {
		if (!Pattern.matches(".*[A-Z].*", password)) {
			return new ValidationDTO(false, "A senha deve conter pelo menos uma letra maiúscula.");
		}
		return new ValidationDTO(true, "senha passou");
	}
}
