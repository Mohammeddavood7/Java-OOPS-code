package dec.reuse;

public class BlcOfEmployeeDetails
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double employeeSalary;
	private int noOfProject;
	
	public void setEmployeeData(String fName,String lName,int empId,double empSal,int noOfproject) 
	{
		firstName = fName;
		lastName =lName;
		employeeId = empId;
		employeeSalary =empSal;
		noOfProject = noOfproject;
		
		
	}
	public void calculateNoOfProjects()
	{
		if(noOfProject>5&&noOfProject<=10)
		{
			employeeSalary += 5000;
		}
		else if(noOfProject>10&&noOfProject<=20)
		{
			employeeSalary += 10000;
		}
		else if(noOfProject>20)
		{
			employeeSalary += 15000;
		}
	}
	@Override
	public String toString()
	{
		return "BlcOfEmployeeDetails\nFirstName= " + firstName + "\nLastName= " + lastName + "\nEmployeeId= " + employeeId
				+"\nTotal Emp salary= "+  employeeSalary + "\nNoOfProject= " + noOfProject;
	}

}
