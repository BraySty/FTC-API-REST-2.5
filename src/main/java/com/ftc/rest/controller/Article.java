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
public class Article {
	
	@GetMapping("/articles")
	public  ResponseEntity<String> getArticles() {
		return ResponseEntity.ok("GET articles endpoint");
	}
	
	@GetMapping("/articles/{id}")
	public ResponseEntity<String> getBlog(@PathVariable("id") ResponseEntity<String> line) {
		return ResponseEntity.ok("GET article: " + line);
	}
	
	@PostMapping("/articles/{id}")
	public  ResponseEntity<String> postArticle(@PathVariable("id") ResponseEntity<String> line) {
		return ResponseEntity.ok("POST article: " + line);
	}
	
	@PutMapping("/articles/{id}")
	public  ResponseEntity<String> putArticle(@PathVariable("id") ResponseEntity<String> line) {
		return ResponseEntity.ok("PUT article: " + line);
	}
	
	@DeleteMapping("/articles/{id}")
	public  ResponseEntity<String> deleteArticle(@PathVariable("id") ResponseEntity<String> line) {
		return ResponseEntity.ok("DELETE article: " + line);
	}
	
}
