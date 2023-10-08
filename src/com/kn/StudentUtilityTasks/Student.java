package com.kn.StudentUtilityTasks;

public class Student
{
	int id;
	String name;
	int marks;
	public Student(int id2, String name2, int marks2) 
	{
		this.id=id2;
		this.name=name2;
		this.marks=marks2;
	}
	public static void searchStudentByID(Student[] arr) 
	{
		System.out.println("************Linear Search*************");
		int element=438;
		for(int i=0;i<arr.length;i++)
		{
			if(element==arr[i].id)
			{
				System.out.println("Element Found");
				break;
			}
		}
		System.out.println("***********Binary Search************");
		int low=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			int mid=(low+high)/2;
			if(arr[mid].id==element)
			{
				break;
			}
			else if(element>arr[mid].id)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}
		System.out.println();
	}

	public static void searchStudentByName(Student[] arr) 
	{
		System.out.println("**************Linear Search**************");
		String name="Suleman";
		for(int i=0;i<arr.length;i++)
		{
			if(name.equals(arr[i].name))
			{
				System.out.println("Name found");
				break;
			}
		}
		System.out.println("**************Binary Search**************");
		int low=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			int mid=(low+high)/2;
			if(arr[mid].name.equals(name))
			{
				break;
			}
			else if(name.compareTo(arr[mid].name)>0)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
		{
			System.out.println("Name not found");
		}
		else
		{
			System.out.println("Name found");
		}
		System.out.println();
	}
	public static void applyGraceMarks(Student[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].marks<35)
			{
				arr[i].marks+=(35-arr[i].marks);
			}
			System.out.println(arr[i].marks);
		}
	}
	public static Student[] sortByStudentID(Student[] arr) 
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i].id;
			int j=i-1;
			while(j>=0 && temp<arr[j].id)
			{
				arr[j+1].id=arr[j].id;
				j--;
			}
			arr[j+1].id=temp;
		}
		return arr;
	}
	
	
}
