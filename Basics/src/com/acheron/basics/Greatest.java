package com.acheron.basics;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int greatest;
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		greatest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > greatest) {
				greatest = array[i];
			}
		}

		System.out.println("The greatest element in the array is: " + greatest);
		sc.close();
	}
}
