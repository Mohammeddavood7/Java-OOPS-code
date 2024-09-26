package Com.feb22.labtaskByown;

public class Promotion 
{
	public static void promotion(EmployeeTCS empT)
	{
		if(empT.getEmpScore() >= 8)
		{
			ManagerTCS m = new ManagerTCS(empT);
			m.setDesignation("Manager");
			m.setEmpSal(100000);
		}
		
	}

}
