package com.senhasegura.validacao;

import org.springframework.stereotype.Component;

import com.senhasegura.DTO.ValidationDTO;

@Component
public class ValidationPasswordLenght implements Validation{

	
	
	public ValidationDTO validation(String password) {
		if(password.length() < 8) {
			return new ValidationDTO(false, "A senha deve ter no mínimo 8 caracteres.");
		}
		return new ValidationDTO(true, "senha passou");
	}
}
