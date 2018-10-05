package hooksample;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Before("@Signup")
	public void beforeScenario(){
		System.out.println("This is before hook");
	}

	@After("@Signup")
	public void afterScenario(){
		System.out.println("This is after hook");
	}
	
	@Before
	public void beforeScenarionoTag(){
		System.out.println("This is before hook without tag");
	}

	@After
	public void afterScenarionoTag(){
		System.out.println("This is after hook without tag");
	}

	@Given("^Launch the Firefox browser$")
	public void Launch_the_Firefox_browser(){
		System.out.println("Launch the Firefox browser");
	}

	@Given("^I launch the application$")
	public void I_launch_the_application(){
		System.out.println("I launch the application");
	}


	@Then("^I enter correct username and password$")
	public void I_enter_correct_username_and_password(){
		System.out.println("I enter correct username and password");
	}


	@And("^Clicked on Login Button$")
	public void Clicked_on_Login_Button(){
		System.out.println("Clicked on Login Button");
	}


	@And("^I am login into application$")
	public void I_am_login_into_application(){
		System.out.println("I am login into application");
	}





}
