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
public class Blog {
	
	@GetMapping("/blogs")
	public  ResponseEntity<String> getBlogs() {
		return ResponseEntity.ok("GET blogs endpoint");
	}
	
	@GetMapping("/blogs/{id}")
	public  ResponseEntity<String> getBlog(@PathVariable("id") String line) {
		return ResponseEntity.ok("GET blog: " + line);
	}
	
	@PostMapping("/blogs/{id}")
	public  ResponseEntity<String> postBlog(@PathVariable("id") String line) {
		return ResponseEntity.ok("POST blog: " + line);
	}
	
	@PutMapping("/blogs/{id}")
	public  ResponseEntity<String> putBlog(@PathVariable("id") String line) {
		return ResponseEntity.ok("PUT blog: " + line);
	}
	
	@DeleteMapping("/blogs/{id}")
	public  ResponseEntity<String> deleteBlog(@PathVariable("id") String line) {
		return ResponseEntity.ok("DELETE blog: " + line);
	}
	
}
