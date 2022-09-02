package com.acheron.scanner;

import java.util.Scanner;

public class ShortAND {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();

		if (first < second && first < third) {
			System.out.println("The smallest number is: " + first);
		} else if (second < third) {
			System.out.println("The smallest number is: " + second);
		} else {
			System.out.println("The smallest number is: " + third);
		}
		sc.close();
	}
}
