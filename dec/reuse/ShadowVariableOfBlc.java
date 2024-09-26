package dec.reuse;

public class ShadowVariableOfBlc 
{
	int studentId = 111;
	String studentName ="smith";
	public void setStudentsDetails()//int sId,String sName
	{
		int studentId = 999;
		String studentName = "Scott";
		System.out.println(studentId+"\n"+studentName);
	}
	public void getStudentDetails()
	{
		System.out.println("Id of the student: "+studentId);
		System.out.println("Name of the student: "+studentName);
	}

}
