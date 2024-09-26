package Com.feb13.abstraction;

abstract public class Student
{
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents = 60;
	
    public abstract int getPercentage();//abstractMethod
    
    public static int getTotalNoStudents()
    {
    	return totalNoOfStudents;
    }
    
    public Student(String studentName,String studentClass,int totalNoOfStudents)
    {
    	this.studentName = studentName;
    	this.studentClass = studentClass;
        Student.totalNoOfStudents = totalNoOfStudents;
    }

}
