package jan_8_ClassAsReturnTypeOfMethod;

public class MainCourseUsingSetter
{
	public static void main(String[] args) 
	{

	Course c1 = new Course("C","Ryan");
	if(c1.getName().equals("C"))
	{
		System.out.println("He is already in the coreJava ");
	}
	c1.setName("java");
	
    if(c1.getName().equals("java"))
	{
		System.out.println("He is moved in Advance java ");
	}
    
	
	}

}
