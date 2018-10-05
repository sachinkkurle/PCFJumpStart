package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
       System.out.println("validate_the_browser");
	}

	@When("^Browser is triggerd$")
	public void browser_is_triggerd() throws Throwable {
	       System.out.println("browser_is_triggerd");
	}

	@Then("^Check if browser is open$")
	public void check_if_browser_is_open() throws Throwable {
	       System.out.println("check_if_browser_is_open");
	}

	@Given("^User is on net banking Landing Page$")
	public void user_is_on_net_banking_landing_page() throws Throwable {
		System.out.println("Code to User is on net banking Landing Page");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("Code to User login into application with username and password");

	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Code to Home page is populated");

	}

	@And("^Cards are Displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Code to Cards are Displayed");

	}

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("user_login_into_application_with_something_and_something");
	}

	@And("^Cards are not Displayed$")
	public void cards_are_not_displayed() throws Throwable {
		System.out.println("Code to Cards are not Displayed");
	}

	@When("^User signup with folliwng details$")
	public void user_signup_with_folliwng_details(DataTable datatable) throws Throwable {
		List<List<String>> dataraw = datatable.raw();
		System.out.println(dataraw.get(0).get(0));
	}

	@And("^Cards diplayed are \"([^\"]*)\"$")
	public void cards_diplayed_are_something(String strArg1) throws Throwable {
		System.out.println("Code to Cards with true and false");
	}

	@When("^User login in to application with (.+) and (.+)$")
	public void user_login_in_to_application_with_and(String username, String password) throws Throwable {
		System.out.println("Username " + username + " Password " + password);
	}

}