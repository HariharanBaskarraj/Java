package com.acheron.basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int reverseNumber = 0;
		int duplicate;
		int unit = 0;
		System.out.println("Enter the number to reverse");
		duplicate = number = sc.nextInt();

		while (number > 0) {
			unit = number % 10;
			reverseNumber = reverseNumber * 10 + unit;
			number /= 10;
		}

		System.out.println("The reverse of " + duplicate + " is " + reverseNumber);
		sc.close();
	}

}
