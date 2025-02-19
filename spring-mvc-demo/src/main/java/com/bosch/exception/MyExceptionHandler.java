package com.bosch.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ResponseBody
	@ExceptionHandler(value = {EmployeeNotFoundException.class})
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMapper handleException(Exception e, HttpServletRequest request) {
		String errorMesage=e.getMessage();
		String url=request.getRequestURI();
		return new ErrorMapper(errorMesage, url, LocalDateTime.now());
	}
	
	@ResponseBody
	@ExceptionHandler(value = {EmployeeUpdateException.class})
	@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
	public ErrorMapper handleException1(Exception e, HttpServletRequest request) {
		String errorMesage=e.getMessage();
		String url=request.getRequestURI();
		return new ErrorMapper(errorMesage, url, LocalDateTime.now());
	}
	
	@ResponseBody
	@ExceptionHandler(value = {MethodArgumentNotValidException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public Map<String, String> handleException2(MethodArgumentNotValidException ex) {
		Map<String,String> m=new HashMap<String,String>();
		ex.getBindingResult().getAllErrors().forEach(e->{
			String fname=((FieldError)e).getField();
			String msg=e.getDefaultMessage();
			m.put(fname, msg);
		});
		return m;
	}


}












