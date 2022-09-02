package com.acheron.basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 1;
		int count;
		int swap;

		System.out.println("Enter the count of elements");
		count = sc.nextInt();
		System.out.print("The fibonacci series upto " + count + " is ");

		while (count > 0) {
			System.out.print(firstNumber + " ");
			swap = secondNumber + firstNumber;
			firstNumber = secondNumber;
			secondNumber = swap;
			count--;
		}
		sc.close();
	}
}
