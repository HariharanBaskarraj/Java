package com.oops.vehicle;

public class Vehicle {
	String name;String model;
	int price;

	Vehicle(String name, String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println("The owner's name is " + name);
		System.out.println("The model is " + model);
		System.out.println("The price of the car is " + price);
}
}