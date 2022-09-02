package com.acheron.scanner;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int array[] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array: ");
		
		for (int i = 0; i < array.length; i++) { // Populating and Computing Sum
			array[i] = sc.nextInt();
			sum += array[i];
		}

		int average = sum / array.length; // Computing Average

		System.out.println("Sum is " + sum);
		System.out.println("Average is " + average);

		sc.close();
	}
}
