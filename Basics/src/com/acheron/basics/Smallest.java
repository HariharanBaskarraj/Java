package com.acheron.basics;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int smallest;
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}

		System.out.println("The smallest element in the array is: " + smallest);
		sc.close();
	}
}
