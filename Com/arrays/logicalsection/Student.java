package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class Student
{
	private String name;
	private int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many student object you want to store: ");
		int index = sc.nextInt();
		Student s[] = new Student[index];
		
		for(int i=0; i<s.length; i++)
		{
			System.out.print("Enter the name: ");
			String name = sc.next();
			System.out.print("Enter the id: ");
			int id = sc.nextInt();
			Student s1 = new Student(name,id);
			s[i]=s1;
			
		}
//		
//		for(int i=0; i<s.length;i++)
//		{
//			System.out.println(s[i]+" ");
//		}
		
		System.out.println(Arrays.toString(s));
	}

}
