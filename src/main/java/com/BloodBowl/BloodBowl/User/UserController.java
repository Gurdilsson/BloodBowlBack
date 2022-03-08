package com.BloodBowl.BloodBowl.User;

import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userService.findAllUser();
	}

	@ResponseBody
	@RequestMapping("/auth/{id}/{mdp}")
	public ResponseEntity<?> Authentification(@PathVariable String id, @PathVariable String mdp) {
		Iterable<User> users = userService.findAllUser();
		for (User user : users) {
			if (user.getUserName().equals(id)) {
				if (user.getUserPassword().equals(mdp)) {
					return new ResponseEntity<>(user, HttpStatus.OK);
				}
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@ResponseBody
	@PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		User newUser = userService.createUser(user);
		if (newUser == null) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<>(newUser, HttpStatus.CREATED);
		}

	}
}
