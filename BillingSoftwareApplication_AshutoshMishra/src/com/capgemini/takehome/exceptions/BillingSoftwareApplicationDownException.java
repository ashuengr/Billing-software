package com.capgemini.takehome.exceptions;

public class BillingSoftwareApplicationDownException extends RuntimeException{
	public BillingSoftwareApplicationDownException() {
		super();
	}
	public BillingSoftwareApplicationDownException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public BillingSoftwareApplicationDownException(String message, Throwable cause) {
		super(message, cause);
	}
	public BillingSoftwareApplicationDownException(String message) {
		super(message);
	}
	public BillingSoftwareApplicationDownException(Throwable cause) {
		super(cause);
	}
}
