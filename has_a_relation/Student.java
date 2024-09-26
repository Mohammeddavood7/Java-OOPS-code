package has_a_relation;

public class Student
{
	private int studentId;
	private String studentName;
	private double studentFees;
	
	public Student(int studentId, String studentName, double studentFees) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
	}







	public double getStudentFees() {
		return studentFees;
	}


	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ "]";
	}


}
