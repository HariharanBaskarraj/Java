package com.voterapp.exceptions;

public class NotEligibleException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NotEligibleException() {
		super();
	}

	public NotEligibleException(String message) {
		super(message);
	}

}
