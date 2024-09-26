package has_a_relation;
import java.util.Scanner;

//ELC
public class TypeOfEmployee 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee Salary :");
		double sal = sc.nextDouble();
		
		
		e1.setEmpSalary(sal);
		
		double empSalary =  e1.getEmpSalary();
		
		if(empSalary >=40000)
		{
			System.out.println("You are a developer...");
		}
		else if(empSalary >=25000)
		{
			System.out.println("You are a Designer...");
		}
		else
		{
			System.out.println("You are a Tester...");
		}
		sc.close();
	}
}