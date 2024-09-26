package Com.jan25.hasarelation;

public class Student 
{
	private int studentId;
	private String studentName;
	private double studentFee;
	private int age;
	
	
	public Student(int studentId, String studentName, double studentFee, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", age=" + age + "]";
	}
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getStudentFee() {
		return studentFee;
	}
	public int getAge() {
		return age;
	}
	
	

}
