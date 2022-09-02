package com.acheron.basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int checkArmstrong;
		int unit = 0;
		int sum = 0;
		int duplicate;
		
		System.out.println("Enter the number to check Armstrong");
		duplicate = checkArmstrong = sc.nextInt();

		while (checkArmstrong > 0) {
			unit = checkArmstrong % 10;
			sum += unit * unit * unit;
			checkArmstrong /= 10;
		}

		if (duplicate == sum) {
			System.out.println("The entered number is an armstrong number");
		} else {
			System.out.println("The entered number is not an armstrong number");
		}
		sc.close();
	}

}
