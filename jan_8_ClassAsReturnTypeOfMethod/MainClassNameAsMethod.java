package jan_8_ClassAsReturnTypeOfMethod;

import java.util.Scanner;

public class MainClassNameAsMethod 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How object you want to take ? :");
		int obj = sc.nextInt();
		for(int i=1;i<=obj;i++)
		{
		 Employee emp = Employee.getEmployeeObject();
		 System.out.println("Object: "+i+"\n"+emp);
		 System.out.println("-----------------------------");
		}
		
	}

}
