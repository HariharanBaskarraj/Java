package com.oops.bank;

public class Bank {

	double oldBalance;

	public Bank(double oldBalance) {
		this.oldBalance = oldBalance;
	}

	public void withdraw(int amount) {
		double newBalance;
		if (amount > oldBalance) {
			System.out.println("Insufficient Balance");
			System.out.println("The remaining amount is " + oldBalance);
		} else {
			System.out.println("Collect the cash...");
			newBalance = getBalance(amount);
			System.out.println("The remaining amount is " + newBalance);
			oldBalance = newBalance;
		}
	}

	public void deposit(int amount) {
		double newBalance;
		if (amount < 200000) {
			System.out.println("Amount " + amount + " is deposited successfully...");
			newBalance = getBalance(-amount);
			System.out.println("The remaining amount is " + newBalance);
			oldBalance = newBalance;

		} else {
			System.out.println("Deposits above 200000 are not permissable via ATM");
			System.out.println("The remaining amount is " + oldBalance);
		}
	}

	public double getBalance(int amount) {
		return oldBalance - amount;
	}
}
