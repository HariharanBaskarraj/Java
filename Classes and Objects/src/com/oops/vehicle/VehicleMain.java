package com.oops.vehicle;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, model and price of the vehicle: ");
		String name = sc.next();
		sc.nextLine();
		String model = sc.nextLine();
		int price = sc.nextInt();

		Vehicle vehicle = new Vehicle(name, model, price);
		vehicle.getDetails();
		sc.close();

	}

}
