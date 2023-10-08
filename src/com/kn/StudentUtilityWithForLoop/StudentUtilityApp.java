package com.kn.StudentUtilityWithForLoop;

import java.util.Scanner;

public class StudentUtilityApp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number Of Objects = ");
		int n=sc.nextInt();
		Student[] arr=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Id = ");
			int a=sc.nextInt();
			System.out.print("Enter the name = ");
			String b=sc.next();
			System.out.print("Enter the Marks = ");
			int c=sc.nextInt();
			Student s=new Student(a,b,c);
			arr[i]=s;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
			arr[i].study();
			sc.close();
		}
	}
}
