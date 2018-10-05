package com.studentapp.cucumber.serenity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.studentapp.model.StudentClass;
import com.studentapp.utils.ReuseableSpecification;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class StudentSerenitySteps {

	@Step("create student with firstName:{0}, lastName:{1} , email:{2}, programme:{3}, courses: {4} ")
	public ValidatableResponse createStudent(String firstName, String lastName, String email, String programme,
			List<String> courses) {

		StudentClass student = new StudentClass();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setProgramme(programme);
		student.setEmail(email);
		student.setCourses(courses);

		return SerenityRest.rest().given()
				.spec(ReuseableSpecification.getGenericRequestSpecification())
				.when().body(student).post().then();
	}
	
	@Step("Getting the student information with firstName: {0}")
	public HashMap<String, Object> getStudentInfoByFirstName(String firstName){
		HashMap<String, Object> value=	SerenityRest.rest()
				.given()
				.when()
				.get("/list")
				.then()
				.log()
				.all()
				.statusCode(200)
				.extract()
				.path("findAll{it.firstName=='"+firstName+"'}.get(0)");
		
		return value;

	}
	
	
	@Step("Update student with firstName:{0}, lastName:{1} , email:{2}, programme:{3}, courses: {4}, StudentId:{5} ")
	public ValidatableResponse updateStudent(String firstName, String lastName, String email, String programme,
			List<String> courses, int studentId) {

		StudentClass student = new StudentClass();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setProgramme(programme);
		student.setEmail(email);
		student.setCourses(courses);

		return SerenityRest.rest().given()
				.spec(ReuseableSpecification.getGenericRequestSpecification())
				.when().body(student)
				.put("/"+studentId).then();
	}
	
	@Step("delete student with  StudentId:{0} ")
	public void deleteStudent( int studentId) {

		

		 SerenityRest.rest().given()
				.contentType(ContentType.JSON)
				.when()
				.delete("/"+studentId);
	}
	
	@Step("get student with  StudentId:{0} ")
	public ValidatableResponse getStudent( int studentId) {

		

		return SerenityRest.rest().given().when().get("/"+studentId).then();

	}
	
	@Step
	public HashMap<String, Object> getStudentInfoByEmailId(String email) {

		String p1 = "findAll{it.email=='";
		String p2 = "'}.get(0)";
		return SerenityRest
				.rest().given().when().get("/list").then().extract()
				.path(p1 + email + p2);
	}

}
