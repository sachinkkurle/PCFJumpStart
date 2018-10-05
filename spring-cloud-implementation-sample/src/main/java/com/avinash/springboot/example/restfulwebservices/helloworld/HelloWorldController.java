package com.avinash.springboot.example.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;
	
	@GetMapping( path="/hello-world")
	public String HelloWorld()
	{
		return "Hello World";
	}

	@GetMapping( path="/hello-world-bean")
	public HelloWorldbean HelloWorldBean()
	{
		return new HelloWorldbean("Hello World");
	}

	@GetMapping( path="/hello-world-bean/path-variable/{name}")
	public HelloWorldbean HelloWorldBean(@PathVariable String name)
	{
		return new HelloWorldbean("Hello World " + name);
	}
	
	@GetMapping( path="/hello-world-bean-Internationalized")
	public String HelloWorldInternationalized(@RequestHeader(name="Accept-Language", required = false) Locale locale)
	{
		return messageSource.getMessage("good.morning.message",null, locale);
	}


}
