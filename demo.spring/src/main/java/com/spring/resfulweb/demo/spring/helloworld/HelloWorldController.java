package com.spring.resfulweb.demo.spring.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	@GetMapping(path = "/Hello-world")
	public String HelloWorld() {
		return"Hello-World";
	}
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloworldBean() {
		//throw new RuntimeException("some error occured!!Contact Support ******");
		return new HelloWorldBean("Hello-World-bean-changed");
	}
	
	///hello-world-bean/path-variable/sangeeta
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloworldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello-World ,%s",name));
	}

}