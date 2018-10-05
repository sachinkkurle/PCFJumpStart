package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class SimpleHystrixCircutBreaker {

	@RequestMapping(value = "/recommended")
	  @HystrixCommand(fallbackMethod = "reliable")
	  public String readingList(){
		System.out.println("readingList");
		throw new RuntimeException();

   //return "I am Working copy";
	  }
	
	public String reliable()
	{
		System.out.println("Fallacbk reliable");

		
	//	System.out.println("readingList");
		   return "I fall back";
	}

	
}
