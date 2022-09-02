package com.acheron.basics;

public class PyramidOne{

	public static void main(String[] args) {
		int space = 5;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < space - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i; k++) {
				if (k % 2 == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			space--;
			System.out.println(" ");
		}
	}
}
