package com.inheritance.bank;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("Enter your type of account: Savings(S) or Current(C)");
			char accountType = sc.next().charAt(0);

			if (accountType == 'S') {
				System.out.println("What do you want to do? Deposit(D) or Withdraw(W)");
				char response = sc.next().charAt(0);
				double amount;
				switch (response) {
				case 'D': 
					Account savings = new Savings(10000); // DMD
					System.out.println("Enter the amount you need to deposit");
					amount = sc.nextDouble();
					savings.deposit(amount);
					break;
				case 'W':
					System.out.println("Enter the amount you need to withdraw");
					savings = new Savings(10000); // DMD
					amount = sc.nextDouble();
					savings.withdraw(amount);
					break;
				default:
					System.out.println("Use correct code");
				}
			} else if (accountType == 'C') {
				System.out.println("What do you want to do? Deposit(D) or Withdraw(W)");
				char response = sc.next().charAt(0);
				double amount;
				switch (response) {
				case 'D': 
					System.out.println("Enter the amount you need to deposit");
					Account current = new Current(10000); // DMD
					amount = sc.nextDouble();
					current.deposit(amount);
					break;
				case 'W':
					System.out.println("Enter the amount you need to withdraw");
					current = new Current(10000); // DMD
					amount = sc.nextDouble();
					System.out.println(amount);
					current.withdraw(amount);
					break;
				default:
					System.out.println("Use correct code");
				}
			} else {
				System.out.println("Use the correct code");
			}

			System.out.println("Do you want to continue: 'Y' or 'N'");
			char status = sc.next().charAt(0);

			if (status != 'Y') {
				System.out.println("Thank you for using. Come again...");
				sc.close();
				System.exit(0);
			}
		}
	}

}
