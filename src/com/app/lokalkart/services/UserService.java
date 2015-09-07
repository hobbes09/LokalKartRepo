package com.app.lokalkart.services;

import com.app.lokalkart.entities.User;

public interface UserService extends GenericService<User, Long>{
	
	boolean signUpUser(User user);
	boolean authenticateUser(User user);
	boolean validateUser(User user);

}
