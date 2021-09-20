package com.abc.mhealth.Exception;

import java.net.http.HttpHeaders;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.abc.mhealth.payload.ErrorResponse;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
//	@ExceptionHandler(value=ResourceNotExistingException.class)
//	public ResponseEntity<String> handleResourceAlreadyExistingException(Exception e){	
//		
//		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
//	}
//	
//	@ExceptionHandler(value=DuplicateEntryException.class)
//	public ResponseEntity<String> handleDuplicateEntryException(Exception e) {
//		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	@ExceptionHandler(value=ResourceNotExistingException.class)
	public ResponseEntity<ErrorResponse> handleResourceAlreadyExistingException(Exception e){	
		ErrorResponse errorResp = new ErrorResponse();
		errorResp.setError(e.getMessage());
		errorResp.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errorResp,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=DuplicateEntryException.class)
	public ResponseEntity<ErrorResponse> handleDuplicateEntryException(Exception e) {
		ErrorResponse errorResp = new ErrorResponse();
		errorResp.setError(e.getMessage());
		errorResp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity<>(errorResp,HttpStatus.INTERNAL_SERVER_ERROR);
	}

//	@Override
//	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		Map<String,Object> body = new LinkedHashMap<>();
//		
//		//get all errors
//		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x ->x.getDefaultMessage())
//				.collect(Collectors.toList());
//		
//		body.put("errors",errors);
//		
//		return new ResponseEntity<>(body,headers,status);
//	}
}
