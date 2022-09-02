package com.oops.overloading;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee name of all: ");
		String empName1 = sc.nextLine();
		String empName2 = sc.nextLine();
		String empName3 = sc.nextLine();

		System.out.println("Enter the employee designation of all(Manager/Programmer/Director) : ");
		String empDesg1 = sc.nextLine();
		String empDesg2 = sc.nextLine();
		String empDesg3 = sc.nextLine();

		Employee employee1 = new Employee(empName1, empDesg1);
		determineMethod(employee1);
		Employee employee2 = new Employee(empName2, empDesg2);
		determineMethod(employee2);
		Employee employee3 = new Employee(empName3, empDesg3);
		determineMethod(employee3);

		sc.close();
	}

	public static void determineMethod(Employee employee) {
		double basicAllowance = 25998.76;
		double carAllowance = 8569.12;
		double houseAllowance = 9506.57;

		if (employee.designation.equals("Manager")) {
			System.out.println(employee.calcBonus(basicAllowance, carAllowance));
		} else if (employee.designation.equals("Programmer")) {
			System.out.println(employee.calcBonus(basicAllowance));
		} else if (employee.designation.equals("Director")) {
			System.out.println(employee.calcBonus(basicAllowance, carAllowance, houseAllowance));
		} else {
			System.out.println("Give proper designation");
		}

	}

}
