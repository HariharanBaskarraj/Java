package com.acheron.scanner;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		int flag=0;
		String str[] = new String[] { "hariharan", "niroshan", "aadish", "akash", "aakash" };
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username to login");
		String temp = sc.next();
		
		for (String iterate : str) {
			
			if (temp.equals(iterate)) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag==1) {
			System.out.println("You are logged in successfully");
		} else {
			System.out.println("Invalid username");
		}
		sc.close();
	}

}
