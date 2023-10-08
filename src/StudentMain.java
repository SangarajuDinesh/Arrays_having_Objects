import java.util.Scanner;

public class StudentMain 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student[] arr=new Student[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the ID = ");
			int a=sc.nextInt();
			System.out.println("Enter the Name = ");
			String b=sc.next();
			Student s=new Student(a, b);
			arr[i]=s;
		}
		Student[] res=Student.sortStudentByDesc(arr);
		for(Student i:res)
		{
			System.out.print(i.id+" ");
		}
	}
}
