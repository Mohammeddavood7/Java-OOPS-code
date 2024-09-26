package Com.feb10.instanceofoperator;

import java.util.Objects;

public class ElcEmployee
{
	public static void main(String[] args)
	{
		EmployeeClass ec = new EmployeeClass(2222, "Scott");
		System.out.println(ec);
		
		System.out.println("======================================");
		
		EmployeeRecord er1 = new EmployeeRecord(3333, "Warner");
		System.out.println(er1);
		System.out.println(er1.empId());
		System.out.println(er1.empName());

		
		EmployeeRecord er2 = new EmployeeRecord(4444, "Smith");
		System.out.println(er2);
		
//		int hash = Objects.hash(3333,"Warner");
//		System.out.println(hash);
	}

}
