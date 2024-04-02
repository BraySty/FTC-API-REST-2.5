package com.ftc.rest.jwt.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
	
	@PostMapping(value = "login")
	public String login() {
		System.out.println("hi2");
		return "Login from public endpoint";
	}
	
	@PostMapping(value = "register")
	public String register() {
		return "Register from public endpoint";
	}
	
}