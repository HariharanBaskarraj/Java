package com.acheron.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int calculateFactorial;
		double factorial = 1;
		System.out.println("Enter the number to calculate factorial");
		calculateFactorial = sc.nextInt();
		
		while (calculateFactorial != 0) {
			factorial *= calculateFactorial;
			calculateFactorial--;
		}
		
		System.out.println("The factorial of " + calculateFactorial + " is: " + (int) factorial);
		sc.close();
	}
}
