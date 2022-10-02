package com.voterapp.main;

import java.util.Scanner;
import com.voterapp.exceptions.NotEligibleException;
import com.voterapp.services.ElectionValidation;

public class VoterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ElectionValidation validation = new ElectionValidation();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your locality");
		String locality = sc.nextLine();
		System.out.println("Enter your voter ID");
		int voterID = sc.nextInt();

		boolean validity = false;
		try {
			validity = validation.checkEligibility(age, locality, voterID);
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();

		if (validity) {
			System.out.println("YOU ARE ELIGIBLE FOR VOTING.\nMAKE SURE YOU VOTE ON THE ELECTION DAY.");
		}
		sc.close();

	}

}
