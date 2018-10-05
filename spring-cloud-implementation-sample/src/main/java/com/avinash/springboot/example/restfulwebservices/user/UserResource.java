package com.avinash.springboot.example.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retriveAllUser() {
		return service.finalAll();
	}

	@GetMapping("/users/{id}")
	public Resource<User> retriveUser(@PathVariable int id) {
		User user = service.findOne(id);

		if (user == null) {
			throw new UserNotFoundExecption("id-" + id);
		}

		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder linkto = linkTo(methodOn(this.getClass()).retriveAllUser());
		resource.add(linkto.withRel("all-users"));
		return resource;
	}

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User saveUser = service.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveUser.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User user = service.deleteById(id);

		if (user == null) {
			throw new UserNotFoundExecption("id-" + id);
		}

	}

}
