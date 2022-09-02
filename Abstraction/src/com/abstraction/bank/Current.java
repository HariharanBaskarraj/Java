package com.abstraction.bank;

public class Current extends ATMMain {

	public Current(double balance) {
		super(balance);
	}

	public void withdraw(double amount) {
		System.out.println("CURRENT ACCOUNT WITHDRAWAL PROCESS");
		if (amount >balance) {
			System.out.println("Insufficient Balance");
			System.out.println("The remaining amount is " + balance + "\n\t Thank you");
		} else {	
			System.out.println("Collect the cash and take your card...");
			balance -=amount;
			System.out.println("The remaining amount is " + getBalance() + "\n\t Thank you");
			
		}
	}

	public void deposit(double amount) {
		System.out.println("CURRENT ACCOUNT DEPOSIT PROCESS");
		System.out.println("Amount " + amount + " is deposited successfully... \nYou can take your card now.");
		balance +=amount;
		System.out.println("The remaining amount is " + getBalance() + "\n\t Thank you");		
	}
}
