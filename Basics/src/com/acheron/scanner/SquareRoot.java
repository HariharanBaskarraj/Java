package com.acheron.scanner;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		int array[] = new int[5];
		double rootArray[] = new double[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < array.length; i++) { // Populating
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < rootArray.length; j++) { // Square Root
			rootArray[j] = Math.sqrt(array[j]);
		}

		System.out.println("The square root of the array is");
		for (double k : rootArray) { // Printing
			System.out.print(String.format("%.3f", k) + " ");
		}

		sc.close();
	}
}
