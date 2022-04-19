package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/testme")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") String id) {
		
		if(id.contentEquals("0")) {
			///exception
			
			throw new ProductNotFoundException();
		}
		else {
			
			return "product was found";
		}
			
	}

}
