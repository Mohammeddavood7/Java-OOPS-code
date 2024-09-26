package JAN_10_TEST;

public class Student
{
	private String studentName;
	private int studentMarks;
	
	public Student(String studentName,int studentMarks)
	{
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	
	public int getStudentGrade()
	{
		return this.studentMarks;
		
	}
	
	public String toString()
	{
		return studentName;
	}

}
