package dec.main;

import java.util.Scanner;

import dec.reuse.StudentDetails;

public class PrintStudentDetails {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rollNumber,Student Name,Student Fees: ");
		long roll = sc.nextLong();
	    String name = sc.next();
	    double fees = sc.nextDouble();
	    String studentDetails = StudentDetails.getStudentDetails(roll, name, fees);
	    System.out.println(studentDetails);
	    sc.close();
	    
		
		
		
	}

}
