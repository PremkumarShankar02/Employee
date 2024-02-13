package com.employee.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(value=NameException.class)
	public ResponseEntity<Object> NameExceptionHandling(NameException ne){
		return new ResponseEntity<>(ne.getMessage(),HttpStatus.NOT_FOUND);
	}
	
  @ExceptionHandler(value=NoSuchElementException.class)
	   public ResponseEntity<Object> IdExcep(NoSuchElementException ns){
		   return new ResponseEntity<>(ns.getMessage(),HttpStatus.NOT_FOUND);
	   }
   }


