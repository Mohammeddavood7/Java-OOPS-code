package Com.jan25.hasarelation;

import java.util.Scanner;

public class Trainee 
{
	public static void display(Student student)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Id of student: ");
		int id = sc.nextInt();
		if(id == student.getStudentId())
		{
			System.out.println(student);
		}
		else
		{
			System.out.println("No such student Available !!! ");
		}
		
		
		
      } 
}