package com.studentapp.junit.studentinfo;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;
import com.studentapp.utils.TestUtil;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;

@Concurrent(threads="4x")
@UseTestDataFrom("testdata/studentinfo.csv")
@RunWith(SerenityParameterizedRunner.class)
public class CreateStudentDataDrivenTest extends TestBase {
	
	private String firstName ;
	private String lastName ;
	private String programme ;
	private String email ;
	private int studentId;
	private String course;

	@Steps
	StudentSerenitySteps studentSerenitySteps;
	
	
	

	
	public String getCourse() {
		return course;
	}





	public void setCourse(String course) {
		this.course = course;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getProgramme() {
		return programme;
	}





	public void setProgramme(String programme) {
		this.programme = programme;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public int getStudentId() {
		return studentId;
	}





	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}





	public StudentSerenitySteps getStudentSerenitySteps() {
		return studentSerenitySteps;
	}





	public void setStudentSerenitySteps(StudentSerenitySteps studentSerenitySteps) {
		this.studentSerenitySteps = studentSerenitySteps;
	}





	@Title("Data Driven test for Adding multpile Student")
	@Test
	public void createMutipleStudent(){
		ArrayList<String> courses = new ArrayList<String>();
		courses.add(course);
		
		studentSerenitySteps.createStudent(firstName, lastName, email, programme, courses)
		.statusCode(201);
	}

}
