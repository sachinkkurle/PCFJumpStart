package com.studentapp.junit.studentinfo;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.studentapp.testbase.TestBase;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
public class TagTest extends TestBase {
	
	@WithTag("studentfeature:NEGATIVE")
	@Title("Provide 405 status code incorrenct HttpMethd")
	@Test
	public void inValidMethod(){
		SerenityRest.given()
		.when()
		.post("/list")
		.then()
		.log()
		.all()
		.statusCode(405)
		.log()
		.all();
	}
	
	
	@WithTags(
			{
			@WithTag("studentfeature:SMOKE"),
			@WithTag("studentfeature:POSTIVE")			}
			)
	@Title("Provide 200 status code correct HttpMethd")
	@Test
	public void verifyIfStatusCodeis200(){
		SerenityRest.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	
	@WithTags(
			{
			@WithTag("studentfeature:SMOKE"),
			@WithTag("studentfeature:NEGATIVE")
			}
			)
	@Title("Provide 400 status code incorrect Http Resource")
	@Test
	public void incorrectResource(){
		SerenityRest.given()
		.when()
		.get("/listdd")
		.then()
		.log()
		.all()
		.statusCode(400);
	}
	
}
