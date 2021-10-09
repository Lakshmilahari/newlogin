package com.abc.mhealth.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.mhealth.entity.User;
import com.abc.mhealth.payload.LoginPayload;
import com.abc.mhealth.Service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping("/sregister")
	public ResponseEntity<String> register(@Valid @RequestBody User USER) {
		User user = userService.registerUser(USER);
		return new ResponseEntity<>("Registered Successfully: " +user.getEmail(),HttpStatus.CREATED);
		
	}
	

	@PostMapping("/login")
	
	    public ResponseEntity<String> login(@Valid @RequestBody LoginPayload loginPayload){
		
		User user = userService.login(loginPayload.getEmail(),loginPayload.getPassword());
		return new ResponseEntity<>("LoggedIn Successfully: " +user.getEmail() + "  , login: "+ user.isLoggedIn(), HttpStatus.OK);
	}
	
	
	@PostMapping("/logout/{email}")
	
    public ResponseEntity<String> logout(@Valid @PathVariable("email") String email){
	User user = userService.logout(email);	
	return new ResponseEntity<>("LoggedOut Successfully: " +user.getEmail(), HttpStatus.OK);
}

	
}
