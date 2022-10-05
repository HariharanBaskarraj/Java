package com.voterapp.services;

import com.voterapp.exceptions.*;

public class ElectionValidation {
	String[] localities = { "Trichy", "Madurai", "Chennai", "Coimbatore", "Salem" };

	public boolean checkAge(int age) throws UnderAgeException {
		boolean flagResult = false;
		
		if (age >= 18) {
			flagResult = true;
		} else {
			throw new UnderAgeException("You have to turn 18 inorder to vote.");
		}
		
		return flagResult;
	}

	public boolean checkLocality(String locality) throws LocalityNotFoundException {
		boolean flagResult = false;
		
		for (String local : localities) {
			if (locality.equalsIgnoreCase(local)) {
				flagResult = true;
				break;
			}
		}
		if (!flagResult) {
			throw new LocalityNotFoundException(
					"Currently, there is no election in your locality. Or, please enter the correct locality name.");
		}
		
		return flagResult;
	}

	public boolean checkVoterID(int voterID) throws VoterIDInvalidException {
		boolean flagResult = false;
		
		if (voterID >= 1000 && voterID <= 5000) {
			flagResult = true;
		} else {
			throw new VoterIDInvalidException(
					"Your voter id is not registered in the electoral roll. Please register.");
		}
		
		return flagResult;
	}

	public boolean checkEligibility(int age, String locality, int voterID) throws NotEligibleException {
		int valid = 0;
		boolean result = true;

		try {
			if (checkAge(age)) {
				System.out.println("Your age is valid.");
				valid++;
			}
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
			if (checkLocality(locality)) {
				System.out.println("Your locality is available.");
				valid++;
			}
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			if (checkVoterID(voterID)) {
				System.out.println("Your Voter ID is valid.");
				valid++;
			}
		} catch (VoterIDInvalidException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("\n\nKindly see the validation results below.....\n");
		}

		if (valid != 3) {
			throw new NotEligibleException("YOU ARE NOT ELIGIBLE FOR VOTING!!!");
		}
		return result;
	}
}