package dec.reuse;

public class StudentDetailsBlc 
{
	private int studentId;
	private String studentName;
	private int studentMarks;
	private char studentGrade;
	
	public void setStudentData(int sId,String sName,int sMarks)
	{
		studentId = sId;
		studentName = sName;
		studentMarks = sMarks;	
	}
	
	public String calculateStudentMarks()
	{
		if(studentMarks >= 90)
		{
			studentGrade = 'A';
			
		}
		else if(studentMarks>=81 && studentMarks<90)
		{
			studentGrade = 'B';
			
		}
		else if(studentMarks>=71&&studentMarks<81)
		{
			studentGrade = 'C';
			
		}
		else if(studentMarks>=61&&studentMarks<71)
		{
			studentGrade = 'D';
			
		}
		else if(studentMarks>=35&&studentMarks<61)
		{
			studentGrade = 'C';
			
		}
		else if(studentMarks<35){
			studentGrade = 'f';
		}
		return ""+studentGrade;
	}
	
	public String getStudentData()
	{
		String result="";
		
   return result += "Id of the Student: "+studentId+"\nName of the Student Name: "+studentName+"\nMarks of the student: "+studentMarks;
		
	}

}
