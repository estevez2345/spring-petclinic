package org.springframework.samples.petclinic.system;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InsecureDemoController {

	@GetMapping("/insecure-cookie")
	String insecureCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("session_demo", "12345");
		response.addCookie(cookie);

		return "Cookie insegura creada";
	}

}