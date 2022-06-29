package com.travel.kltp.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.kltp.Service.UserService;
import com.travel.kltp.entities.User;
import com.travel.kltp.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	@Override
	public User getUserById(int id) {
		return this.userRepository.findUserById(id);
	}



	@Override
	public User addNewUser(User user) {
		return this.userRepository.save(user);
	}

}
