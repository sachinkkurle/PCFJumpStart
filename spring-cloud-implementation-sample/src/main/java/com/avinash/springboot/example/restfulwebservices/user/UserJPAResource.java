package com.avinash.springboot.example.restfulwebservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
public class UserJPAResource {
	@Autowired
	private UserDaoService service;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@GetMapping("/jpa/users")
	public List<User> retriveAllUser() {
		return userRepository.findAll();
	}

	@GetMapping("/jpa/users/{id}")
	public Resource<User> retriveUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);

		if (!user.isPresent()) {
			throw new UserNotFoundExecption("id-" + id);
		}

		Resource<User> resource = new Resource<User>(user.get());
		ControllerLinkBuilder linkto = linkTo(methodOn(this.getClass()).retriveAllUser());
		resource.add(linkto.withRel("all-users"));
		return resource;
	}

	@PostMapping("/jpa/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User saveUser = userRepository.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveUser.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}

	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		 service.deleteById(id);

		
	}
	
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> retriveAllUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);

		if (!user.isPresent()) {
			throw new UserNotFoundExecption("id-" + id);
		}

		return user.get().getPost();
	}
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Object> createPost(@PathVariable int id, @RequestBody Post post) {
		Optional<User> user = userRepository.findById(id);

		if (!user.isPresent()) {
			throw new UserNotFoundExecption("id-" + id);
		}

        User Optinoaluser = user.get();
        post.setUser(Optinoaluser);
        
        postRepository.save(post);
        
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}


}
