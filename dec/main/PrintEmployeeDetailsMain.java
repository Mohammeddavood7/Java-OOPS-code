package dec.main;

import dec.reuse.BlcOfEmployeeDetails;

public class PrintEmployeeDetailsMain
{
	public static void main(String[] args)
	{
		
		BlcOfEmployeeDetails emp = new BlcOfEmployeeDetails();
		emp.setEmployeeData("Will", "Smith",111,10000,11);
		emp.calculateNoOfProjects();
		String string = emp.toString();
		System.out.println(string);
	}

}
