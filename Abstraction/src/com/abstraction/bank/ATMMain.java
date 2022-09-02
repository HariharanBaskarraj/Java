package com.abstraction.bank;
import java.util.Scanner;

abstract public class ATMMain extends Account {

	ATMMain(double balance) {
		super(balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		for (;;) {
			System.out.println("Enter your type of account: Savings(S) or Current(C)");
			char accountType = sc.next().charAt(0);
			Account account =null;
			if (accountType == 'S') {
				account = new Savings(10000); 
			}else if(accountType == 'C'){
				account = new Current(10000); 
			}else{
				System.out.println("Use the correct code");
			}
			
			System.out.println("What do you want to do? Deposit(D) or Withdraw(W)");
				char response = sc.next().charAt(0);
				double amount;
				switch (response) {
				case 'D': 
					System.out.println("Enter the amount you need to deposit");
					amount = sc.nextDouble();
					account.deposit(amount);
					break;
				case 'W':
					System.out.println("Enter the amount you need to withdraw");
					amount = sc.nextDouble();
					account.withdraw(amount);
					break;
				default:
					System.out.println("Use correct code");
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
