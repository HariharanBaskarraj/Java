package com.acheron.basics;

public class Odd {

	public static void main(String[] args) {
		// Method 1
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}

		// Method 2
		for (int j = 1; j <= 20; j += 2) {
			System.out.println(j);
		}
	}

}
