package JAN_10_TEST;

import java.util.Scanner;

public class MainStudentAndStudentGrade 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String studentName = sc.nextLine();
		System.out.print("Enter the Marks: ");
		int mark = sc.nextInt();
		
		Student s1= new Student(studentName, mark);
		       
	    StudentGrade grade = CalculateStudentGrade.getCalculateStudentGrade(s1);
	    System.out.println(grade);
	    sc.close();
	}
 
	
}
