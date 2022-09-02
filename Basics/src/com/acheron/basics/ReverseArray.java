package com.acheron.basics;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("The reversed order of the array is: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}
