package jan_4;

public class StudentBlc 
{
	int studentId;
	String studentName;
	public void setStudentData(int studentId,String studentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	@Override
	public String toString() {
		return "StudentBlc [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	

}
