package com.travel.kltp.Service;

import java.util.List;

import com.travel.kltp.entities.User;

public interface UserService {
	
	public User getUserById(int id);
	
	public User addNewUser(User user);

}
