package com.cognixia.lockdown.httpapi1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

//	 /name /sasdasd
	@GetMapping("/{n}")
	public String getIndex(@PathVariable("n") String name) {
		return "Hello " + name;
	}

	@GetMapping("/name")
	public String sayName() {
		return "/name path";
	}

	// http://localhost:8080/faiz/Mr.
	@GetMapping("/{name}/{title}")
	public String sayNameTitle(@PathVariable("name") String name, @PathVariable("title") String title) {
		return "Hello " + title + " " + name;
	}
	
	
	@GetMapping("/jsonResponse/{v1}/{v2}")
	public Response jsonResponse(@PathVariable("v1") String v1,@PathVariable("v2") String v2) {
		Response resp = new Response();
		resp.v1=v1;
		resp.v2=v2;
		
		return resp;
	}
}
