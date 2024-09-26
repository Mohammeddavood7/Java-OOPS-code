package Com.jan_lab;

public class Hosteller extends Student
{
    private double hostelFee;

	public Hosteller(int studentId, String studentName, double studentExamFee, double hostelFee) {
		super(studentId, studentName, studentExamFee);
		this.hostelFee = hostelFee;
	}

	public double getHostelFee() {
		return hostelFee;
	}
	
	public String displayDetails(Student student,DayScholar dayScholar)
	{
		return dayScholar.toString()+"\n"+student.toString();
		
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", getStudentId()=" + getStudentId() + ", getStudentName()="
				+ getStudentName() + ", getStudentExamFee()=" + getStudentExamFee()
				 +"]";
	}
	
	

	
	
	

	
    
}
