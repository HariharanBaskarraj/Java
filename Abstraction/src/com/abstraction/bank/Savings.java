package com.abstraction.bank;


public class Savings extends ATMMain {
	
	public Savings(double balance) {
		super(balance);
	}
	
	
	public void withdraw(double amount) {
		System.out.println("SAVINGS ACCOUNT WITHDRAWAL PROCESS");
		if (amount > balance) {
			System.out.println("Insufficient Balance");
			System.out.println("The remaining amount is " + balance + "\n\t Thank you");
		} else {
			System.out.println("Collect the cash and take your card...");
			balance -=amount;
			System.out.println("The remaining amount is " + getBalance()+ "\n\t Thank you");
		}
	}

	public void deposit(double amount) {
		System.out.println("SAVINGS ACCOUNT DEPOSIT PROCESS");
		if (amount < 200000) {
			System.out.println("Amount " + amount + " is deposited successfully... \nYou can take your card now.");
			balance +=amount;
			System.out.println("The remaining amount is " + getBalance() + "\n\t Thank you");
		} else {
			System.out.println("Deposits above 200000 are not permissable via ATM");
			System.out.println("The remaining amount is " + balance + "\n\t Thank you");
		}
	}
}
