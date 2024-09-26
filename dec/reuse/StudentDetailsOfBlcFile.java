package dec.reuse;

public class StudentDetailsOfBlcFile 
{
	int studentRoll;
	String studentName;
	static String studentCollege = "Naresh i Technologies";
	static String studentCollegeAddress = "Ameerpet,Hyderabad-500018";
	static String studentCourse = "Full Stack Java";
	
	public void setStudentsDate(int studentRoll,String studentName)
	{
		this.studentRoll = studentRoll;
		this.studentName = studentName;
	}

	@Override
	public String toString() 
	{
		return "RollNumber of the Student: " + studentRoll + "\nName of the student: " + studentName 
				+"\nName of the college: "+studentCollege+"\nAddress of the College: "
				+studentCollegeAddress+"\nName of the Course: "+studentCourse;
	}
	

	

}
