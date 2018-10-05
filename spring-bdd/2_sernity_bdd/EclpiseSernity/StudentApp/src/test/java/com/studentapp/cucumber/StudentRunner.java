package com.studentapp.cucumber;

import org.junit.runner.RunWith;

import com.studentapp.testbase.TestBase;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/")
public class StudentRunner extends TestBase{


}
