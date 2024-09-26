package Com.jan23_heriachal;

public class Developer extends Employee 
{
	public Developer(double developerSalary)
	{
		super(developerSalary);
	}

	@Override
	public String toString() {
		return "Developer [salary=" + salary + "]";
	}

	
	

}
