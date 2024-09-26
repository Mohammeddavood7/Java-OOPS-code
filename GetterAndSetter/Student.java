package GetterAndSetter;

public class Student
{
	public int Student()
	{ 
		
		accept();
		System.out.println("no hello world");
		return 15;
	}
	
	public void accept()
	{
		System.out.println("Helllo world");
		
	}
	
	public static void main(String[] args) 
	{
     int x = new Student().Student();
     System.out.println(x);
     
		
	}

}
