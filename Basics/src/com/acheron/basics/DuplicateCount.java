package com.acheron.basics;

import java.util.Scanner;

public class DuplicateCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int swap;
		int count = 0;
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < 10; i++) {
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

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					break;
				}

			}
		}
		System.out.println("Total number of duplicate elements are: " + count);
		sc.close();
	}
}
