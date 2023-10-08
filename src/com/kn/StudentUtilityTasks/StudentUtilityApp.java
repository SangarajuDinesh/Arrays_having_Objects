package com.kn.StudentUtilityTasks;

import java.util.Scanner;

public class StudentUtilityApp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Objects = ");
		int n=sc.nextInt();
		Student[] arr=new Student[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the id of "+(i+1)+" Student = ");
			int id=sc.nextInt();
			System.out.print("Enter the Name of "+(i+1)+" Student = ");
			String name=sc.next();
			System.out.print("Enter the Marks of "+(i+1)+" Student = ");
			int marks=sc.nextInt();
			Student s=new Student(id,name,marks);
			arr[i]=s;
			System.out.println();
		}
		System.out.println("Search by Student ID ");
		Student.searchStudentByID(arr);
		System.out.println("Search Student Name ");
		Student.searchStudentByName(arr);
		System.out.println("Apply Grace Marks to Student Marks");
		Student.applyGraceMarks(arr);
		System.out.println("Sort Student Data by ID");
		Student[] res=Student.sortByStudentID(arr);
		for(Student i:res)
		{
			System.out.print(i.id+" ");
		}
		sc.close();
	}

}
