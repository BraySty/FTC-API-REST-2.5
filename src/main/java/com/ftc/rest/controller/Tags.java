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
public class Tags {
	
	@GetMapping("/tags")
	public ResponseEntity<String> getTags() {
		return ResponseEntity.ok("GET tags endpoint");
	}
	
	@GetMapping("/tags/{id}")
	public  ResponseEntity<String> getTag(@PathVariable("id") String line) {
		return ResponseEntity.ok("GET tag: " + line);
	}
	
	@PostMapping("/tags/{id}")
	public ResponseEntity<String> postTag(@PathVariable("id") String line) {
		return ResponseEntity.ok("POST tag: " + line);
	}
	
	@PutMapping("/tags/{id}")
	public ResponseEntity<String> putTag(@PathVariable("id") String line) {
		return ResponseEntity.ok("PUT tag: " + line);
	}
	
	@DeleteMapping("/tags/{id}")
	public ResponseEntity<String> deleteTag(@PathVariable("id") String line) {
		return ResponseEntity.ok("DELETE tag: " + line);
	}
	
}
