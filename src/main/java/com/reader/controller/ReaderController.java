package com.reader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ReaderController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String greet() {
		return "Hello, I am working fine@!";
	}
	
	@GetMapping("/books/{id}")
	public Object getBook(@PathVariable("id") Integer id) {
		Object r = restTemplate.getForObject("http://book-microservice/books/"+id,Object.class);
	  return r;	
	}
	
	@GetMapping("/searchbook")
	public Object searchBook(@RequestParam("category") String category,
			@RequestParam("authorName") String authorName, 
			@RequestParam("price") Double price) {
		String url="http://book-microservice/search?category={category}&authorName={authorName}&price={price}";
		Object r = restTemplate.getForObject(url,Object.class);
	  return r;	
	}
	
}
