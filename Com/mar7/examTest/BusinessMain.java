package Com.mar7.examTest;

import java.util.Arrays;

public class BusinessMain 
{
	public static void main(String[] args) 
	{
		Employee [] emp = new Employee[3];
		emp[0] = new Employee("Scott",111);
		emp[1] = new Employee("Warner", 333);
		emp[2] = new Employee("Smith",222);
	    
		System.out.print(Arrays.toString(emp));
		
		int id[] = new int[emp.length];
		
		for(int i=0;i<emp.length;i++)
		{
			id[i] = emp[i].getEmpId();
		}
		
		System.out.println("\nUnsort Ids: "+Arrays.toString(id));
		
		Arrays.sort(id);
		System.out.println("sort Ids: "+Arrays.toString(id));

		
		
		
	}

}
