package kr.co.mytest.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(java.lang.NullPointerException.class)
	public String handleException() {
		return "error2";
	}
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String exception1() {
		return "error1";
	}
}
