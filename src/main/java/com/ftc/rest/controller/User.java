package com.ftc.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V0")
public class User {
	
	@GetMapping("/users")
	public  ResponseEntity<String> getDetails() {
		return ResponseEntity.ok("GET users endpoint");
	}
	
	@GetMapping("/users/{id}")
	public  ResponseEntity<String> getUser(@PathVariable("id") String line) {
		return ResponseEntity.ok("GET user: " + line);
	}
	
	@PostMapping("/users/{id}")
	public  ResponseEntity<String> postUser(@PathVariable("id") String line) {
		return ResponseEntity.ok("POST user: " + line);
	}
	
	@PutMapping("/users/{id}")
	public  ResponseEntity<String> putUser(@PathVariable("id") String line) {
		return ResponseEntity.ok("PUT user: " + line);
	}
	
	@DeleteMapping("/users/{id}")
	public  ResponseEntity<String> deleteUser(@PathVariable("id") String line) {
		return ResponseEntity.ok("DELETE user: " + line);
	}
	
}
