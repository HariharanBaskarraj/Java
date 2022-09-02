package com.acheron.basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the primality test");
		int checkPrime = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i < checkPrime / 2; i++) {
			if (checkPrime % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (!isPrime) {
			System.out.println("The number is not prime");
		} else {
			System.out.println("The number is prime");
		}
		sc.close();
	}
}
