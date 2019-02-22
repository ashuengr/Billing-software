package com.capgemini.takehome.exceptions;

public class InvalidProductQuantityException extends RuntimeException{
	public InvalidProductQuantityException() {
		super();
	}
	public InvalidProductQuantityException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public InvalidProductQuantityException(String message, Throwable cause) {
		super(message, cause);
	}
	public InvalidProductQuantityException(String message) {
		super(message);
	}
	public InvalidProductQuantityException(Throwable cause) {
		super(cause);
	}
}
