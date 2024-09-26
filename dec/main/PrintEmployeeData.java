package dec.main;

import java.util.Scanner;

public class PrintEmployeeData
{
	
	int empId ;
	String empName;
	double empSal;
	
	public void setEmployeeData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empId: ");
		empId = sc.nextInt();
		System.out.print("Enter the empName: ");
		empName = sc.nextLine();
		empName = sc.nextLine();
		System.out.print("Enter the empSal: ");
		empSal = sc.nextDouble();
		sc.close();
		
		}
	public String getEmployeeData()
	{
		String result="";
		result += "empId is : "+empId+"\nempName is : "+"\nempSalary is: "+empSal;
        return result;
	}
	
	public static void main(String[] args) 
	{
		PrintEmployeeData emp = new PrintEmployeeData();
		emp.setEmployeeData();
		String employeeData = emp.getEmployeeData();
		System.out.println("................Answer/Result...............");
		System.out.println(employeeData);
		
	}

}
