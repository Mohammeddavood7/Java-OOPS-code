package Com.feb22.labtaskByown;

public class MainEmployeetcsANDmanagertcs
{
	public static void main(String[] args) 
	{
		EmployeeTCS et = new EmployeeTCS(111,"Scott","Senior Software Engineer",9,40000);
		System.out.println(et);


		ManagerTCS mt = new ManagerTCS(et);
		System.out.println(mt);
		
		
	}

}
