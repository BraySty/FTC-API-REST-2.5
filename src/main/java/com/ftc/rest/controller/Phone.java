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
public class Phone {
	
	@GetMapping("/phones")
	public  ResponseEntity<String> getPhones() {
		return ResponseEntity.ok("GET phones endpoint");
	}
	
	@GetMapping("/phones/{vale}")
	public  ResponseEntity<String> getPhone(@PathVariable("vale") String line) {
		return ResponseEntity.ok("GET phone: " + line);
	}
	
	@PostMapping("/phones/{vale}")
	public  ResponseEntity<String> postPhone(@PathVariable("vale") String line) {
		return ResponseEntity.ok("POST phone: " + line);
	}
	
	@PutMapping("/phones/{vale}")
	public  ResponseEntity<String> putPhone(@PathVariable("vale") String line) {
		return ResponseEntity.ok("PUT phone: " + line);
	}
	
	@DeleteMapping("/phones/{vale}")
	public  ResponseEntity<String> deletePhone(@PathVariable("vale") String line) {
		return ResponseEntity.ok("DELETE phone: " + line);
	}
	
}
