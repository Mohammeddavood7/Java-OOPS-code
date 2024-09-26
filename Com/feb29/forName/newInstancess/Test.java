package Com.feb29.forName.newInstancess;


 class Student
{
	int a = 10;
	
	public void invite()
	{
		System.out.println("You are Inivited Student class");
	}
}

 public class Test {
	    public static void main(String[] args) throws Exception {

			Object obj = Class.forName(args[0]).newInstance();
	        System.out.println("Object is created: " + obj.getClass().getName());
	            Student stud = (Student)obj;
	            stud.invite();

	    }
	}








































































