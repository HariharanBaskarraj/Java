package com.voterapp.exceptions;

public class VoterIDInvalidException extends NotEligibleException {

	private static final long serialVersionUID = 1L;

	public VoterIDInvalidException() {
		super();
	}

	public VoterIDInvalidException(String message) {
		super(message);
	}
}
