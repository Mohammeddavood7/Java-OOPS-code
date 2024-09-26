package jan_CopyLab;

import java.util.Scanner;

public class MainOnEmployee
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Salary: ");
		Scanner sc = new Scanner(System.in);
		double empSal = sc.nextDouble();
		Employee emp = new Employee(232, "Naresh", empSal);
		
		if(emp.getEmployeeSalary()>=60000)
		{
			System.out.println("Employee is a Developer.");
		}
		else if(emp.getEmployeeSalary()>=40000&&emp.getEmployeeSalary()<60000)
		{
			System.out.println("Employee is a Designer. ");
		}
		else
		{
			System.out.println("Employee is a Test.");
		}
		
		sc.close();
	}


}
