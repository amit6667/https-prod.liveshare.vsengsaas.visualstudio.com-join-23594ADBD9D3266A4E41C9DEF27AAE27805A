package com.cognixia.lockdown.httpapi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String getIndex() {
		return "Hello World!";
	}

	@GetMapping("/hello")
	public String sayHell() {
		return "<form action=\"/\" method=\"post\">\r\n"
				+ "    <input type=\"text\" name=\"name\" />\r\n"
				+ "    <button type=\"submit\">Submit</button>\r\n"
				+ "</form>\r\n"
				+ "";
				
	}
	
	@PostMapping("/")
	public String postIndex() {
		return "Post Mapping";
	}

	@DeleteMapping("/")
	public String deleteIndex() {
		return "Delete Mapping";
	}

	@PutMapping("/")
	public String putIndex() {
		return "Put Mapping";
	}
}
