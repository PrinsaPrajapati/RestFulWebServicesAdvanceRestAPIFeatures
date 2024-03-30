package com.prinsa.rest.webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {

	// /hello-world
	@GetMapping(path="hello-world")
   //@RequestMapping(method=RequestMethod.GET ,path="hello-world")
	public String helloWorld() {
		return "Hello-world !";
	}
	//http://localhost:8080/hello-world-bean
	@GetMapping(path="hello-world-bean")
	   //@RequestMapping(method=RequestMethod.GET ,path="hello-world")
		public HelloWorldBean helloWorldBean() {
			return  new HelloWorldBean("Hello-world !");
		}
	
	//http://localhost:8080/hello-world/path-variable/Prinsa
	@GetMapping(path="hello-world/path-variable/{name}")
	   //@RequestMapping(method=RequestMethod.GET ,path="hello-world")
		public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
			//return  new HelloWorldBean("Hello-world !" +name);
			return  new HelloWorldBean(String.format("Hello-World,%s", name));
		}
}
