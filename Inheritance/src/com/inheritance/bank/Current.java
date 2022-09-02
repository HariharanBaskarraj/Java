package com.inheritance.bank;

public class Current extends Account {
	

	public Current(double balance) {
		super(balance);
	}

	public void withdraw(double amount) {
		double newBalance=0;
		System.out.println("CURRENT ACCOUNT WITHDRAWAL PROCESS");
		if (amount >balance) {
			System.out.println("Insufficient Balance");
			System.out.println("The remaining amount is " + balance + "\n\t Thank you");
		} else {	
			System.out.println("Collect the cash and take your card...");
			newBalance = getBalance(amount,'W');
			System.out.println("The remaining amount is " + newBalance + "\n\t Thank you");
			balance = newBalance;
		}
	}

	public void deposit(double amount) {
		double newBalance=0;
		System.out.println("CURRENT ACCOUNT DEPOSIT PROCESS");
		System.out.println("Amount " + amount + " is deposited successfully... \nYou can take your card now.");
		newBalance = getBalance(amount,'D');
		System.out.println("The remaining amount is " + newBalance + "\n\t Thank you");
		balance = newBalance;
		
	}
}
