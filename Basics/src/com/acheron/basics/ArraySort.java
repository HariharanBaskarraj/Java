package com.acheron.basics;

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int swap;
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print("The array sorted in ascending order is: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				swap = 0;
				if (array[i] > array[j]) {
					swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}
