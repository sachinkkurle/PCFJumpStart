package background.mypackage;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
	monochrome = true,
	features = "src/background.mypackage",
	plugin = {"pretty", "html:target/cucmber-html-report"}
	//tags = "@Sanity"
)

public class loginStepTestRunner {

	
	
}
