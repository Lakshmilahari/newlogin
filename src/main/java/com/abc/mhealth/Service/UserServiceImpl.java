package com.abc.mhealth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.abc.mhealth.entity.User;
import com.abc.mhealth.Exception.AuthenticationFailureException;
import com.abc.mhealth.Exception.ResourceAlreadyExistingException;
import com.abc.mhealth.Exception.ResourceNotFoundException;
import com.abc.mhealth.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userssRep;
	
	

	@Override
	public User registerUser(User userss) {
		User optionalAccount = userssRep.findByEmail(userss.getEmail());
		if(optionalAccount!=null) {
			throw new ResourceAlreadyExistingException("Account already existing with email;" +userss.getEmail());
		}
		return userssRep.save(userss);
		
	}
	
	@Override
	public User login(String email, String password) {
		User user = userssRep.login(email,password);
		if(user == null) {
			throw new AuthenticationFailureException("email or password incorrect");
		}else {
			user.setLoggedIn(true);
		}
		return user;
	}
	
	
	@Override
	public User logout(String email) {
		User user = userssRep.findByEmail(email);
		if(user==null) {
			throw new ResourceNotFoundException("email not existing");
			
		}
		else if(user.isLoggedIn()==true) {
			user.setLoggedIn(false);
			userssRep.save(user);
		}
		return user;
	}
		
}
	


	


	
	
	



