package ObjectThrougConstruction;

public class MainOnEmployeeManager 
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee(111, "Scott");
		
		Manager m1 = new Manager(e1);
		System.out.println(m1);
	}

}
