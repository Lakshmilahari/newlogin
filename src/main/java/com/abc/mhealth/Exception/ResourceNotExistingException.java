package com.abc.mhealth.Exception;

public class ResourceNotExistingException extends RuntimeException {
	public ResourceNotExistingException() {
		
	}
    public ResourceNotExistingException(String message) {
		super(message);
	}

}
