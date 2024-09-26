package Com.feb23.methodreferencing;

public class EmployeeMain
{
	public static void main(String[] args)
	{
		InterfaceEmployee ie = Employee::employeeDetails;
		ie.empDetail("Scott", 1111);
		
	}

}
