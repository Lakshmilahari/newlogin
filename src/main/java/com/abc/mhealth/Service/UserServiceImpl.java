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
	private UserRepository USERRep;
	
	

	@Override
	public User registerUser(User USER) {
		User optionalAccount = USERRep.findByEmail(USER.getEmail());
		if(optionalAccount!=null) {
			throw new ResourceAlreadyExistingException("Account already existing with email;" +USER.getEmail());
		}
		return USERRep.save(USER);
		
	}
	
	@Override
	public User login(String email, String password) {
		User user = USERRep.login(email,password);
		if(user == null) {
			throw new AuthenticationFailureException("email or password incorrect");
		}else {
			user.setLoggedIn(true);
		}
		return user;
	}
	
	
	@Override
	public User logout(String email) {
		User user = USERRep.findByEmail(email);
		if(user==null) {
			throw new ResourceNotFoundException("email not existing");
			
		}
		else if(user.isLoggedIn()==true) {
			user.setLoggedIn(false);
			USERRep.save(user);
		}
		return user;
	}
		
}
	


	


	
	
	



