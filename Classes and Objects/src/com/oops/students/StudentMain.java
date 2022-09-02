package com.oops.students;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Name1:");
		String name1=sc.nextLine();
		System.out.println("id1");
		int id1=sc.nextInt();sc.nextLine();
		System.out.println("marks1 (5 subjects out of 100)");
		int[] marks1=new int[5];
		for(int i=0;i<marks1.length;i++)
		{
			marks1[i]=sc.nextInt();
		}
		sc.nextLine();

		System.out.println("Name2: ");
		String name2=sc.nextLine();
		System.out.println("id2");
		int id2=sc.nextInt();sc.nextLine();
		System.out.println("marks2 (5 subjects out of 100)");
		int[] marks2=new int[5];
		for(int i=0;i<marks2.length;i++)
		{
			marks2[i]=sc.nextInt();
		}
		
		Student s1=new Student(name1,id1,marks1);
		s1.getDetails();
		Student s2=new Student(name2,id2,marks2);
		s2.getDetails();
		sc.close();
	}

}
