package com.inheritance.bank;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) {

	}

	void deposit(double amount) {

	}

	double getBalance(double amount, char typeResponse) {
		double finalAmount = 0;
		if (typeResponse == 'W') {
			finalAmount = balance - amount;
		} else if (typeResponse == 'D') {
			finalAmount = balance + amount;
		}
		return finalAmount;

	}
}
