package Com.jan_25_lab;

public class DayScholar extends Student
{
	private double transportFee;

	public DayScholar(int studentId, String studentName, double studentExamFee, double transportFee) {
		super(studentId, studentName, studentExamFee);
		this.transportFee = transportFee;
	}
	
	
	public String displayDetails() {
        return "DayScholar[TransportFee=" + transportFee + "," + super.toString() + "]";
    }

	
	
	

}
