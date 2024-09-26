package Com.feb10.instanceofoperator;

public record EmployeeRecord( int empId,String empName)
{
	static int empSal;
	
	//int empAddress;
	
	public EmployeeRecord
	{
		if(empId < 0)
		{
			
			System.err.println("provided data must be positive");
			empId = 0;
		}
		else
		{
			
			System.out.println("provided data is correct");
			
		}
		
	}
	

}
