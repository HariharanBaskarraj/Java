package com.abstraction.bank;

abstract public class Account {
	 double balance;

	Account(double balance) {
		super();
		this.balance=balance;
	}
	

	abstract void withdraw(double amount);
	
	abstract void deposit(double amount);
	
	double getBalance() {	
		return balance;
	}
}
