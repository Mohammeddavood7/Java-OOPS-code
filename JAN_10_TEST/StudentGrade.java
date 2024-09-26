package JAN_10_TEST;

public class StudentGrade
{
	private Student student;
	private char studentGrade;
	
	public StudentGrade(Student student, char studentGrade) 
	{
		super();
		this.student = student;
		this.studentGrade = studentGrade;
	}
	@Override
	public String toString() {
		return "This Student '"+student+"' has '"+"' "+studentGrade;
	}
	
	
	

}
