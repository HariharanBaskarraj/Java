package com.oops.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the ATM application\nPlease insert your card");
		Bank bank = new Bank(10000);

		int depositAmount;
		int withdrawAmount;
		for (;;) {
			System.out.println("What do you want to do? Deposit(D) or Withdraw(W)");
			char response = sc.next().charAt(0);

			if (response == 'D') {
				System.out.println("Enter the amount you need to deposit");
				depositAmount = sc.nextInt();
				bank.deposit(depositAmount);

			} else if (response == 'W') {
				System.out.println("Enter the amount you need to withdraw");
				withdrawAmount = sc.nextInt();
				bank.withdraw(withdrawAmount);

			} else {
				System.out.println("Use correct code");
			}

			System.out.println("Do you want to continue: 'Y' or 'N'");
			response = sc.next().charAt(0);

			if (response != 'Y') {
				System.out.println("\nYou can take your card now.\nThank you for using. \nPlease visit again...");
				sc.close();
				System.exit(0);
			}
		}
	}
}
