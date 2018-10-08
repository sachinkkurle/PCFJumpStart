 package com.spring.learn.swagger.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.learn.swagger.model.Student;
import com.spring.learn.swagger.repository.StudentRepository;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping(value="/allStudents",method=RequestMethod.GET)
	@ApiOperation(value="retrieve All Students",notes = "Find all student details available in db")
	public List<Student> retrieveAllStudents() {
		return studentRepository.findAll();
	}

	@RequestMapping(value="/student/{id}",method=RequestMethod.GET)
	@ApiOperation(value = "Find student by id",
    notes = "Also returns a link to retrieve all students with rel - all-students")
	public Resource<Student> retrieveStudent(@PathVariable long id) {
		Optional<Student> student = studentRepository.findById(id);

		Resource<Student> resource = new Resource<Student>(student.get());

		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllStudents());

		resource.add(linkTo.withRel("all-students"));

		return resource;
	}

	@RequestMapping(value="/deleteStudent/{id}",method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable long id) {
		studentRepository.deleteById(id);
	}

	@RequestMapping(value="/postStudents",method=RequestMethod.POST)
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student savedStudent = studentRepository.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	@RequestMapping(value="/putStudent/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable long id) {

		Optional<Student> studentOptional = studentRepository.findById(id);

		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();

		student.setId(id);
		
		studentRepository.save(student);

		return ResponseEntity.noContent().build();
	}
}
