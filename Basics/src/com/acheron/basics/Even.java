package com.acheron.basics;

public class Even {

	public static void main(String[] args) {		
		//Method 1
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		
		//Method 2
		for (int j = 0; j <= 20; j += 2) {
			System.out.println(j);
		}

	}
}
