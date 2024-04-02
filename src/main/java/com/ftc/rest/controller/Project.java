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
public class Project {
	
	@GetMapping("/projects")
	public  ResponseEntity<String> getProjects() {
		return ResponseEntity.ok("GET projects endpoint");
	}
	
	@GetMapping("/projects/{id}")
	public  ResponseEntity<String> getProject(@PathVariable("id") String line) {
		return ResponseEntity.ok("GET project: " + line);
	}
	
	@PostMapping("/projects/{id}")
	public  ResponseEntity<String> postProject(@PathVariable("id") String line) {
		return ResponseEntity.ok("POST project: " + line);
	}
	
	@PutMapping("/projects/{id}")
	public  ResponseEntity<String> putProject(@PathVariable("id") String line) {
		return ResponseEntity.ok("PUT project: " + line);
	}
	
	@DeleteMapping("/projects/{id}")
	public  ResponseEntity<String> deleteProject(@PathVariable("id") String line) {
		return ResponseEntity.ok("DELETE project: " + line);
	}
	
}
