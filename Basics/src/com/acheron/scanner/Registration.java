package com.acheron.scanner;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		int flag = 0;
		String str[] = new String[] { "hariharan", "niroshan", "aadish", "akash", "aakash" };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name to register");
		String temp = sc.next();

		for (String iterate : str) {
			if (temp.equals(iterate)) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("Name is not unique");
		} else {
			System.out.println("You are registered");
		}
		sc.close();
	}

}
