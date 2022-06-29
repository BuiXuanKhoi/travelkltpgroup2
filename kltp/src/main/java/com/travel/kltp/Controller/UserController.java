package com.travel.kltp.Controller;

import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.kltp.Service.UserService;
import com.travel.kltp.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}




	@GetMapping(value = "/{id}")
	public User findUserById(@PathVariable("id") int id) {
		return this.userService.getUserById(id);
	}
	
	@PostMapping
	public User addNewUser(@RequestBody User user) {
		return this.userService.addNewUser(user);
	}

}
