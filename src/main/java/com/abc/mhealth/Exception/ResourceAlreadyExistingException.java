package com.abc.mhealth.Exception;

public class ResourceAlreadyExistingException extends RuntimeException{
	public ResourceAlreadyExistingException(){
		
	}
    public ResourceAlreadyExistingException(String message){
		super(message);
	}


}