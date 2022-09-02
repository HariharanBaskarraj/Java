package com.oops.overloading;

public class Employee {
	String name, designation;
	double bonus;
	

	
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
		double calcBonus(double basicAllowance) {
		bonus = basicAllowance * 0.2;
		return bonus;
	}

	double calcBonus(double basicAllowance, double carAllowance) {
		bonus = (basicAllowance + carAllowance) * 0.3;
		return bonus;
	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		bonus = (basicAllowance + carAllowance + houseAllowance) * 0.4;
		return bonus;
	}
}
