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
public class Code {
	
	@GetMapping("/codes")
	public  ResponseEntity<String> getCodes() {
		return ResponseEntity.ok("GET codes endpoint");
	}
	
	@GetMapping("/codes/{id}")
	public  ResponseEntity<String> getCode(@PathVariable("id") String line) {
		return ResponseEntity.ok("GET code: " + line);
	}
	
	@PostMapping("/codes/{id}")
	public  ResponseEntity<String> postCode(@PathVariable("id") String line) {
		return ResponseEntity.ok("POST code: " + line);
	}
	
	@PutMapping("/codes/{id}")
	public  ResponseEntity<String> putCode(@PathVariable("id") String line) {
		return ResponseEntity.ok("PUT code: " + line);
	}
	
	@DeleteMapping("/codes/{id}")
	public  ResponseEntity<String> deleteCode(@PathVariable("id") String line) {
		return ResponseEntity.ok("DELETE code: " + line);
	}
	
}
