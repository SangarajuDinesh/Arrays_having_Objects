
public class Student 
{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static Student[] sortStudentByDesc(Student[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i].id;
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].id>temp)
				{
					temp=arr[j].id;
					index=j;
				}
			}
			int num=arr[i].id;
			arr[i].id=arr[index].id;
			arr[index].id=num;
		}
		return arr;
	}
	
}
