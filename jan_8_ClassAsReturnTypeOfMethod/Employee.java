package jan_8_ClassAsReturnTypeOfMethod;

import java.util.Scanner;

public class Employee
{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public static Employee getEmployeeObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee Id: ");
		int empId = sc.nextInt();
		System.out.print("Enter the Employee Name: ");
		String empName = sc.nextLine();
		empName = sc.nextLine();
		Employee e1 = new Employee(empId, empName);
		
		return e1;
	}
	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	
	
	
	

}
