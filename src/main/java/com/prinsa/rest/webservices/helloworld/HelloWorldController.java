package com.prinsa.rest.webservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {

	private MessageSource messageSource;

	public HelloWorldController(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}

	// /hello-world
	@GetMapping(path = "hello-world")
	// @RequestMapping(method=RequestMethod.GET ,path="hello-world")
	public String helloWorld() {
		return "Hello-world !";
	}

	// http://localhost:8080/hello-world-bean
	@GetMapping(path = "hello-world-bean")
	// @RequestMapping(method=RequestMethod.GET ,path="hello-world")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello-world !");
	}

	// http://localhost:8080/hello-world/path-variable/Prinsa
	@GetMapping(path = "hello-world/path-variable/{name}")
	// @RequestMapping(method=RequestMethod.GET ,path="hello-world")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		// return new HelloWorldBean("Hello-world !" +name);
		return new HelloWorldBean(String.format("Hello-World,%s", name));
	}

	// get http://localhost:8080/hello-world-internationalized
	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized() {

		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);

		//return "Hello World V2";

		// 1:
		// 2:
//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)

	}

}
