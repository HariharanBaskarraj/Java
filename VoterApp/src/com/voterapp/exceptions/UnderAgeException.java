package com.voterapp.exceptions;

public class UnderAgeException extends NotEligibleException {

	private static final long serialVersionUID = 1L;

	public UnderAgeException() {
		super();
	}

	public UnderAgeException(String message) {
		super(message);
	}

}
