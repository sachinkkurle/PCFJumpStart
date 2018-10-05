package com.avinash.springboot.example.restfulwebservices.helloworld;

public class HelloWorldbean  {

	private String message;

	public HelloWorldbean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldbean [message=" + message + "]";
	}
	
	

}
