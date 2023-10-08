package com.kn.StudentUtility;

public class StudentUtilityApp 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(439,"Dinesh",81);
		Student s2=new Student(438,"Raju",78);
		Student s3=new Student(433,"Suleman",80);
		Student[] arr=new Student[3];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		System.out.println(arr[0].id+" "+arr[0].name+" "+arr[0].marks);
		System.out.println(arr[1].id+" "+arr[1].name+" "+arr[1].marks);
		System.out.println(arr[2].id+" "+arr[2].name+" "+arr[2].marks);
	}
}
