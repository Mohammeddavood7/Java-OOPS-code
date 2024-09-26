package dec.reuse;

public class StudentDetails {
	public static String getStudentDetails(long roll,String name,double fees)
	{
		return "\n"+"RollNumber of the Student: "+roll+"\nName of the Student: "+name+"\nTution Fees: "+fees;
	}

}
