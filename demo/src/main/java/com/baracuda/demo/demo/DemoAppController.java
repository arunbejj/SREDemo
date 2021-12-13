package com.baracuda.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppController {
	
	@GetMapping("/hello_world")
	public String helloworld() {
		return "Hello world";
	}
	
	@GetMapping("/hello_world/user/{user}")
	public String helloworldUser(
			@PathVariable String user) {
		return "Hello " + user;
	}	
	

}
