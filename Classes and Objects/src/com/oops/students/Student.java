package com.oops.students;

public class Student {
	String name;
	int studentId,marks[];
	
	
	public Student(String name, int studentId, int[] marks) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.marks = marks;
	}
	
	void getDetails()
	{
		System.out.println("The name is : "+name);
		System.out.println("The id is : "+studentId);
		System.out.print("The marks are ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
		getGrades(marks);
	}
	
	Student getGrades(int[] marks)
	{
		int sum=0;
		double average=0.0;
		String grade;
		
		for(int i=0;i<marks.length;i++)   //Sum
		{
			sum+=marks[i];
		}
		
		average=sum/marks.length;   //Average
		
		if(average>90) {   //Grades
			grade="O";
		} else if(average>80) {
			grade="A";
		} else if(average>70) {
			grade="B";
		} else {
			grade="C";
		}
		System.out.print("The total marks scored is : "+sum+"\n");
		System.out.println("The average is :"+average+"\n");
		System.out.println("The grade is :"+grade+"\n");
		return this;
	}
}
