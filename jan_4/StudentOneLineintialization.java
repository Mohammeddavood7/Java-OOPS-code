package jan_4;

public class StudentOneLineintialization 
{
  int studentId;
  String studentName;

	public StudentOneLineintialization(int studentId,String studentName)
	{
		 this.studentId = studentId;
		 this.studentName =  studentName;
	}
	
	public String toString()
	{
		
		return ""+studentId+"\n"+studentName;
	}
	
	
	
}
