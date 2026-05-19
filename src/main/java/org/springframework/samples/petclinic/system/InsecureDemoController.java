package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InsecureDemoController {

	@Value("${demo.database.password:changeme}")
	private String databasePassword;

	@GetMapping("/secure-secret")
	String secureSecret() {
		return "Secret configured securely";
	}

}