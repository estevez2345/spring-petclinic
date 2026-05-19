package org.springframework.samples.petclinic.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InsecureDemoController {

	private static final String DATABASE_PASSWORD = "admin123456";

	@GetMapping("/insecure-secret")
	String insecureSecret() {
		return "Using password: " + DATABASE_PASSWORD;
	}

}