package myPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shoppingStep {

	
	@Given("^I start the application$")
	public void I_start_the_application(){
		System.out.println("I start the application");
	}

    @Then("^I should see a selection of products$")
    public void I_should_see_a_selection_of_products(){
    	System.out.println("I should see a selection of products");
    }
    
    @When("^I browse \"([a-zA-Z]{1,})\" buying product$")
    public void I_browse_without_buying_product(String buyingActivity){
    	System.out.println("I browse "+ buyingActivity +" buying product");
    }
    
    @Then("^my basket \"([a-zA-Z]{1,})\" be empty$")
    public void my_basket_should_be_empty(String action){
    	System.out.println("my basket "+ action +" be empty");
    }
    
    @And("^I \"([a-zA-Z]{1,})\" buy an item$")
    public void I_cannot_buy_an_item(String data){
    	System.out.println("I "+data+" buy an item");
    }
    
    
    /*@When("I browse with buying product")
    public void I_browse_with_buying_product(){
    	System.out.println("I browse with buying product");
    }
    
    @Then("my basket shouldnot be empty")
    public void my_basket_shouldnot_be_empty(){
    	System.out.println("my basket shouldnot be empty");
    }
    
    @And("I can buy an item")
    public void I_can_buy_an_item(){
    	System.out.println("I can buy an item");
    }
    */
    
    
    
    
    

}
