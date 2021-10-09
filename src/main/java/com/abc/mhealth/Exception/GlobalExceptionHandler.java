package com.abc.mhealth.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.abc.mhealth.payload.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(value=AuthenticationFailureException.class)
	public ResponseEntity<ErrorResponse> handleAuthenticationFailureException(Exception e){
		ErrorResponse errorResp = new ErrorResponse();
		errorResp.setError(e.getMessage());
		errorResp.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorResp,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value=ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(Exception e){
		ErrorResponse errorResp = new ErrorResponse();
		errorResp.setError(e.getMessage());
		errorResp.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errorResp,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=ResourceAlreadyExistingException.class)
	public ResponseEntity<ErrorResponse> handleResourceAlreadyExistingException(Exception e){
		ErrorResponse errorResp = new ErrorResponse();
		errorResp.setError(e.getMessage());
		errorResp.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorResp,HttpStatus.BAD_REQUEST);
	}

}
