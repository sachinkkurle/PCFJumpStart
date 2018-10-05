package hooksample;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupStep {

	@Given("^I want to signup into account$")
	public void I_want_to_signup_into_account(){
		System.out.println("I want to signup into account");
	}

	

}
