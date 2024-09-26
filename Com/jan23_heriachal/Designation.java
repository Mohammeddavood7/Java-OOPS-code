package Com.jan23_heriachal;

public class Designation extends Employee
{
	public Designation(double designationSalary)
	{
		super(designationSalary);
	}

	@Override
	public String toString() {
		return "Designation [salary=" + salary + "]";
	}
	
	
}
