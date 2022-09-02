package com.acheron.basics;

public class PyramidTwo {

	public static void main(String[] args) {
		for (int i = 4; i >= 1; i--) {

			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k % 2 == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
		}
	}
}
