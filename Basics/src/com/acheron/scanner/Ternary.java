package com.acheron.scanner;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();

		int result = (first > second & first > third) ? first : (second > third) ? second : third;
		System.out.println("The greatest of three numbers is: " + result);
		sc.close();
	}
}
