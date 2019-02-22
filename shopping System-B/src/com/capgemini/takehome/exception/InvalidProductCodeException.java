package com.capgemini.takehome.exception;

public class InvalidProductCodeException extends Exception{

	public InvalidProductCodeException() {
		super();
	}

	public InvalidProductCodeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public InvalidProductCodeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidProductCodeException(String arg0) {
		super(arg0);
	}

	public InvalidProductCodeException(Throwable arg0) {
		super(arg0);
	}

}
