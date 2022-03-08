package com.BloodBowl.BloodBowl.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	protected @ResponseBody Iterable<User> findAllUser() {
		return userRepository.findAll();
	}
	
	protected User createUser(User user) {
		userRepository.save(user);
		return user;
	}
}
