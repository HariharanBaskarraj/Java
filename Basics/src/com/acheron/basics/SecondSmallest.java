package com.acheron.basics;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int secondSmallest;
		int swap;
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				swap = 0;
				if (array[i] > array[j]) {
					swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}

		secondSmallest = array[1];
		System.out.println("The second smallest element in the array is: " + secondSmallest);
		sc.close();
	}

}
