package Com.jan_lab;

public class Student 
{
	private int studentId;
	private String studentName;
	private double studentExamFee;
	
	public Student()
	{
		
	}
	
	public Student(int studentId, String studentName, double studentExamFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentExamFee = studentExamFee;
	}
	
	
	
	public int getStudentId() {
		return studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public double getStudentExamFee() {
		return studentExamFee;
	}
	

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public void setStudentExamFee(double studentExamFee) {
		this.studentExamFee = studentExamFee;
	}
	
	//method
	public double payFee(double amount)
	{
		double status =  amount - this.studentExamFee;
		return status;
	}
	
	public String displayDetails()
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentExamFee=" + studentExamFee+"]";
	}

	
	
	
	

}
