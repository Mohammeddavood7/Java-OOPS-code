package Com.mar7.examTest;

public class Student
{
	String studentName;
	int studentId;
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	
	
	
	

}
