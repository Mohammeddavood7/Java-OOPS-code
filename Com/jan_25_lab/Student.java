package Com.jan_25_lab;

public class Student 
{
	private int studentId;
	private String studentName;
	private double studentExamFee;
	
	public Student(int studentId, String studentName, double studentExamFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentExamFee = studentExamFee;
	}
	
	@Override
	public String toString() {
		return ", studentId=" + studentId + ", studentName=" + studentName + ", studentExamFee=" + studentExamFee
				+ "]";
	}

	
	
	
	public double payFee(double amount)
	{
        double remainingAmount = studentExamFee - amount;
        if (remainingAmount >= 0)
        {
        	studentExamFee = remainingAmount;
            return 0;
        } 
        else 
        {
        	studentExamFee = 0;
            return -remainingAmount;
        }
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

	
	
	
	
	


}
