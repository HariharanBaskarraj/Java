package com.csv.bean;

public class Employee {
	String name;
	double salary;
	String city;

	public Employee(String name, String city, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getCity() {
		return city;
	}

}
