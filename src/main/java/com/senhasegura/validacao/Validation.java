package com.senhasegura.validacao;

import com.senhasegura.DTO.ValidationDTO;

public interface Validation {
	

	public ValidationDTO validation(String password);
}
