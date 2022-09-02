package com.voterapp.exceptions;

public class LocalityNotFoundException extends NotEligibleException {
	
	private static final long serialVersionUID = 1L;

	public LocalityNotFoundException() {
		super();
	}

	public LocalityNotFoundException(String message) {
		super(message);
	}

}
