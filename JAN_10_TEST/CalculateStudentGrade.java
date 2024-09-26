package JAN_10_TEST;

public class CalculateStudentGrade
{

	public static StudentGrade  getCalculateStudentGrade(Student studentObject) 
	{
		int marks = studentObject.getStudentGrade();
		if(marks>=90)
		{
			return new StudentGrade(studentObject, 'A');
		}
		else if(marks>75&&marks<90)
		{
			return new StudentGrade(studentObject, 'B');
		}
		else if(marks>60&&marks<75)
		{
			return new StudentGrade(studentObject, 'C');
		}
		else if(marks>=35 && marks<60)
		{
			return new StudentGrade(studentObject, 'D');
		}
		else
		{
			return new StudentGrade(studentObject, 'F');
		}
		
	}
     

}
