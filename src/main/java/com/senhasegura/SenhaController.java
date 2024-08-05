package com.senhasegura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senhasegura.DTO.Failures;
import com.senhasegura.service.SenhaService;

@RestController
public class SenhaController {

	@Autowired
	private SenhaService senhaService;

	@PostMapping("/validate-password")
	public ResponseEntity<?> validatePassword(@RequestBody String password) {
		
		Failures failures = senhaService.validatePassword(password);
		
		List<String> failMessages = failures.failures();

		if (failMessages.isEmpty()) {
			return ResponseEntity.ok().body("Senha passou");
		}

		
		return ResponseEntity.badRequest().body(failMessages);
	}
}
