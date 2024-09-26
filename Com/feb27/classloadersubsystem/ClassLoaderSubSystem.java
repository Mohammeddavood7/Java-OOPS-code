package Com.feb27.classloadersubsystem;

class Student{}
class Employee{}
class Manager{}

public class ClassLoaderSubSystem
{
	public static void main(String[] args)
	{
		Class cls = null;
		cls = Student.class;
		
//		cls = Student.class.getClassLoader();
		
		System.out.println(cls.getName());
		
		cls = Employee.class;
		System.out.println(cls.getName());
		
		cls = Manager.class;
		
		System.out.println(cls.getName());
		
		System.out.println("--------------------------\n");
		
		ClassLoader c = Student.class.getClassLoader();
		System.out.println(c); //application class loader
		
		
		System.out.println("--------------\n"+c.getParent());
		
		
		System.out.println(c.getParent().getParent());
	}

}













































































