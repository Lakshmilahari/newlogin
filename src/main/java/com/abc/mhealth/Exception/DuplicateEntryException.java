package com.abc.mhealth.Exception;

public class DuplicateEntryException extends RuntimeException {
	
public DuplicateEntryException(){
		
	}
	
	public DuplicateEntryException(String msg){
		
		super(msg);		
	}

}
