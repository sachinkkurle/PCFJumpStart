package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {


	@Before("@MobileTest")
	public void beforeValidation(){
		System.out.println("Mobile before");
	}
	
	@After("@MobileTest")
	public void afterValidation(){
		System.out.println("Mobile after");
	}
}
