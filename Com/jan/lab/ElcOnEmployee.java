package Com.jan.lab;

public class ElcOnEmployee 
{
	public static void main(String[] args) 
	{
		System.out.println("orginal data");
		Employee emp = new Employee("Raj", 32, 120000, "Software");
		System.out.println(emp);
        System.out.println("Copy constructor data");
		Employee e1 = new Employee(emp);
		System.out.println(e1);
		emp.raiseSalary(10);
		System.out.println("10% Increment of employee salary");
		System.out.println(emp);
	}

}