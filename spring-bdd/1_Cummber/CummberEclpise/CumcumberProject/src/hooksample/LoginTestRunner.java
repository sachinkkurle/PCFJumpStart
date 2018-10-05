package hooksample;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
	monochrome = true,
	features = "src/hooksample",
	plugin = {"pretty", "html:target/cucmber-html-report"}
)

public class LoginTestRunner extends AbstractTestNGCucumberTests{

	
	
}
