package com.prinsa.rest.webservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResourcesController {

   @Autowired
	private UserDAOService service;


	// GET /users    http://localhost:8080/users
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	// GET /users   http://localhost:8080/users/1
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}

	//POST /users
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		service.save(user);
	}
	
}
