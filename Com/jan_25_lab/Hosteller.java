package Com.jan_25_lab;

public class Hosteller extends DayScholar
{
	private double hostelFee;

	public Hosteller(int studentId, String studentName, double studentExamFee, double transportFee, double hostelFee) {
		super(studentId, studentName, studentExamFee, transportFee);
		this.hostelFee = hostelFee;
	}

	
	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee +""+displayDetails()+"]";
	}
	
	
	
	
	
	
	
	
	
	

}
