package dec_18;

import java.util.Scanner;

public class Employee 
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	char employeeGrade;
	
	public void setEmployeeData(int eid, String name, double sal)
	{
		employeeId = eid;
		employeeName = name;
		employeeSalary = sal;
	}
	
	public void calculateEmployeeGrade()
	{
		if(employeeSalary >= 100000)
		{
			employeeGrade = 'A';
		}
		else
		{
			employeeGrade = 'B';
		}
	}
	
	
	
	
	public void getEmployeeData()
	{
		System.out.println("Employee id is :"+employeeId);
		System.out.println("Employee name is :"+employeeName);
		System.out.println("Employee salary is :"+employeeSalary);
		System.out.println("Employee grade is :"+employeeGrade);
	}
		
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empId: ");
		int scId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the empName: ");
		String scNm = sc.nextLine();
		System.out.print("Enter the empSal: ");
		double scSal = sc.nextDouble();
		sc.close();
		e1.setEmployeeData(scId, scNm,scSal);
		e1.calculateEmployeeGrade();
		e1.getEmployeeData();
		
	}

}
