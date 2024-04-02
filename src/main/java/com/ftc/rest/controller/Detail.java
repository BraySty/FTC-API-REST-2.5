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
public class Detail {
	
	@GetMapping("/details")
	public  ResponseEntity<String> getDetails() {
		return ResponseEntity.ok("GET details endpoint");
	}
	
	@GetMapping("/details/{date}")
	public  ResponseEntity<String> getDetail(@PathVariable("date") String line) {
		return ResponseEntity.ok("GET detail: " + line);
	}
	
	@PostMapping("/details/{date}")
	public  ResponseEntity<String> postDetail(@PathVariable("date") String line) {
		return ResponseEntity.ok("POST detail: " + line);
	}
	
	@PutMapping("/details/{date}")
	public  ResponseEntity<String> putDetail(@PathVariable("date") String line) {
		return ResponseEntity.ok("PUT detail: " + line);
	}
	
	@DeleteMapping("/details/{date}")
	public  ResponseEntity<String> deleteDetail(@PathVariable("date") String line) {
		return ResponseEntity.ok("DELETE detail: " + line);
	}
	
}
