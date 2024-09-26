package Com.feb22.labtaskByown;

import Com.Static.ClassONLY.Modification;
import Com.Static.ClassONLY.Employee;

interface Model
{
	void show();
}

public class InterFACEMODEL
{
	public static void main(String[] args) 
	{
		Model m = Modification::show;
		m.show();
		
		Model m1 = new Employee()::show;
		m1.show();
	}

}













































































