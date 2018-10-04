package com.example.service;

import java.util.Date;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class StudentApplication {

	@RequestMapping(value = "/echoStudentName/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name) {
		log.trace("trace log : "+name);
		log.debug("debug log : "+name);
		log.info("Info log : "+name);
		log.warn("warn log : "+name);
		log.error("error log : "+name);
		return "Hello  " + name + " Responsed on : " + new Date();
	}

	@RequestMapping(value = "/getStudentDetails/{name}")
	public Student getStudentDetails(@PathVariable(name = "name") String name) {
		log.trace("trace log : "+name);
		log.debug("debug log : "+name);
		log.info("Info log : "+name);
		log.warn("warn log : "+name);
		log.error("error log : "+name);
		return new Student(name, "India", "MBA");
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
}

class Student {
	String name;
	String address;
	String cls;

	public Student(String name, String address, String cls) {
		super();
		this.name = name;
		this.address = address;
		this.cls = cls;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCls() {
		return cls;
	}

}
