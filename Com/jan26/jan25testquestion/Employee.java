package Com.jan26.jan25testquestion;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double employeeBasicSalary;
	private double employeeHRAPer;
	private double employeeDAPer;
	
	
	public Employee(int employeeId, String employeeName, double employeeBasicSalary, double employeeHRAPer,
			double employeeDAPer) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeBasicSalary = employeeBasicSalary;
		this.employeeHRAPer = employeeHRAPer;
		this.employeeDAPer = employeeDAPer;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public double getEmployeeBasicSalary() {
		return employeeBasicSalary;
	}


	public double getEmployeeHRAPer() {
		return employeeHRAPer;
	}


	public double getEmployeeDAPer() {
		return employeeDAPer;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeBasicSalary="
				+ employeeBasicSalary + ", employeeHRAPer=" + employeeHRAPer + ", employeeDAPer=" + employeeDAPer + "]";
	}
	
	//method
	public double calculateGrossSalary()
	{
		return employeeBasicSalary+employeeHRAPer+employeeDAPer;
	}
	
	
	
	
	
	
	
	
	
	
	

}
