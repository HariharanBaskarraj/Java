package com.acheron.basics;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int checkPerfect;
		int sum = 0;
		System.out.println("Enter the number for the perfect number test");
		checkPerfect = sc.nextInt();

		for (int i = 1; i <= checkPerfect / 2; i++) {
			if (checkPerfect % i == 0) {
				sum += i;
			}
		}

		if (sum == checkPerfect) {
			System.out.println("The number is perfect");
		} else {
			System.out.println("The number is not perfect");
		}
		sc.close();
	}
}
