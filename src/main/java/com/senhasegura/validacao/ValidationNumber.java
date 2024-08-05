package com.senhasegura.validacao;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.senhasegura.DTO.ValidationDTO;

@Component
public class ValidationNumber implements Validation{

	public ValidationDTO validation(String password) {
		if(!Pattern.matches(".*[0-9].*", password)) {
			return new ValidationDTO(false, "A senha deve conter pelo menos um número.");
		}
		return new ValidationDTO(true, "senha passou");
	}
}
