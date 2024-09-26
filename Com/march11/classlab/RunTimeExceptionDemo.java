package Com.march11.classlab;

public class RunTimeExceptionDemo extends RuntimeException
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public RunTimeExceptionDemo(String str) 
	{
		System.out.println(str);
	}
	public static void studentMarks() //throws ClassNotFoundException
	{
		int marks = 101;
		if(marks > 100)
		{
			throw new RunTimeExceptionDemo("Invalid Marks Exception"); 
		}
	}
	
	
	public static void main(String[] args)  throws Exception
	{
		RunTimeExceptionDemo.studentMarks();
	}

}
