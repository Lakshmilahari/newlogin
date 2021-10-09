package com.abc.mhealth.Service;



import com.abc.mhealth.entity.User;


public interface UserService  {

	public User registerUser(User USER);

	public User login(String email, String password);

	public User logout(String email);

	
	
	
	
	
	
}
