package com.studentapp.junit.studentinfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;

@RunWith(SerenityRunner.class)
public class FirstSerenityTest {
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI ="http://localhost:8081/student";
 	}
	
	@Test
	public void getAllStudent(){
		SerenityRest.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void thisIsFailingTest(){
		SerenityRest.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all()
		.statusCode(500);
	}
	
	@Test
	@Pending
	public void thisPendingTest(){
	
	}
	
	@Test
	@Ignore
	public void ThisIsASkippedTest(){
	
	}
	
	@Test
	public void ThisTestCauseError(){
		System.out.println("Division Error " +  5/0);
	
	}
	
	@Test
	public void filedoesnotExist() throws FileNotFoundException{
      File newFile = new File("F://ss.as");
      FileReader freader = new FileReader(newFile);
	}
	
	@Test
	@Manual
	public void IsThisManulTest() throws FileNotFoundException{
   
	}

}
