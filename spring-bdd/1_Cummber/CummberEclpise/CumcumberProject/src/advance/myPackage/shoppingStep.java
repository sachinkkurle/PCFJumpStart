package advance.myPackage;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shoppingStep {

	
	@Given("^I start the application$")
	public void I_start_the_application(DataTable data){
		List<Map<String,String>> list = data.asMaps(String.class, String.class);
		
		
		System.out.println("Application is : "+ list.get(0).get("Applicatio_Name"));
		System.out.println("Application is : "+ list.get(1).get("Applicatio_Name"));

		
		
		System.out.println("I start the application");
	}

    @Then("^I should see a selection of products$")
    public void I_should_see_a_selection_of_products(){
    	System.out.println("I should see a selection of products");
    }
    
    @When("^I browse \"([a-zA-Z]{1,})\" buying product$")
    public void I_browse_without_buying_product(String buyingActivity, DataTable data){
    	
    	List<Map<String, String>> list = data.asMaps(String.class, String.class);
    	
    	System.out.println(list.get(0).get("Product_Name"));
    	System.out.println(list.get(0).get("Product_Company"));
    	System.out.println(list.get(1).get("Product_Name"));
    	System.out.println(list.get(1).get("Product_Company"));
    	
    	
    	
    	
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
