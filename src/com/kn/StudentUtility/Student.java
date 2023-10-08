package com.kn.StudentUtility;

public class Student 
{
	int id;
	String name;
	int marks;
	public Student(int i, String string, int j) 
	{
		this.id=i;
		this.name=string;
		this.marks=j;
	}
	public void study()
	{
		System.out.println("Student can Study..");
	}
}
