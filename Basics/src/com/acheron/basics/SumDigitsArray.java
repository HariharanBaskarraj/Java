package com.acheron.basics;

import java.util.Scanner;

public class SumDigitsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int sumDigit = 0;
		int unit = 0;
		int count = 0;
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < array.length; j++) {
			count += Integer.toString(array[j]).length();
			while (array[j] > 0) {
				unit = array[j] % 10;
				sumDigit += unit;
				array[j] /= 10;
			}
		}

		System.out.println("Sum of all the digits is: " + sumDigit + "\nAverage of all the digits is: "
				+ (float) sumDigit / (float) count);
		sc.close();
	}

}
