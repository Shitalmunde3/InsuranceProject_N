package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurance.model.User;
import com.insurance.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

   
	public User saveUser(User user) {

		User user1=userRepository.save(user);
		return user1;
	}
	
	

}
