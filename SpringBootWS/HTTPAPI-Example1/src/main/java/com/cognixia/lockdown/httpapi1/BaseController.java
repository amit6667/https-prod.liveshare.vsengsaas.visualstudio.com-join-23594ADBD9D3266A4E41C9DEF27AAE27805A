package com.cognixia.lockdown.httpapi1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

//	 /name /sasdasd
//	@GetMapping("/{n}")
//	public String getIndex(@PathVariable("n") String name) {
//		return "Hello " + name;
//	}

	@GetMapping("/name")
	public String sayName() {
		return "/name path";
	}

	// http://localhost:8080/faiz/Mr.
//	@GetMapping("/{name}/{title}")
//	public String sayNameTitle(@PathVariable("name") String name, @PathVariable("title") String title) {
//		return "Hello " + title + " " + name;
//	}
	
	
	@GetMapping("/jsonResponse/{v1}/{v2}")
	public ResponseEntity<Response> jsonResponse(@PathVariable("v1") String v1,@PathVariable("v2") String v2) {
		
		Response resp = new Response();
		resp.v1=v1;
		resp.v2=v2;
		
		ResponseEntity<Response> respEntity = new ResponseEntity<Response>(resp,HttpStatus.OK);
		return respEntity;
	}
	
	@PostMapping("/jsonResponse/")
	public ResponseEntity<Response> postJsonResponse(@RequestBody Request req) {
		Response resp = new Response();
		resp.v1=req.name;
		resp.v2=req.age;
		ResponseEntity<Response> respEntity = new ResponseEntity<Response>(resp,HttpStatus.CREATED);
		return respEntity;
	}
	
	// for paths ending with /, you need to have /
	// if a path doesn't end with /, it will work with/without /
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
