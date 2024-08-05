package com.senhasegura.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senhasegura.DTO.Failures;
import com.senhasegura.DTO.ValidationDTO;
import com.senhasegura.validacao.Validation;

@Service
public class SenhaService {
	
	@Autowired
	public List<Validation> Validations;
	
	
	public Failures validatePassword(String password) {
		 Failures failures = new Failures(new ArrayList<>());
		
		for(Validation val: Validations) {
		
			ValidationDTO result = val.validation(password);
			if(!result.passou()) {	
				
			   failures.failures().add(result.message());
			   
			}
		}
		
		return failures;
		
	}
}
