package Com.feb13.abstraction;

public class HistoryStudents extends Student
{
	private int historyMarks;
	private int civicsMarks;
	
	
	
	
	
	
	
	
	public HistoryStudents(String studentName, String studentClass, int totalNoOfStudents, int historyMarks,
			int civicsMarks) {
		super(studentName, studentClass, totalNoOfStudents);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}








	public int getPercentage()
	{
		int result = 0;
		int total = historyMarks+civicsMarks;
		double percentage =  (total%200)*100;
		
		
		if(percentage > 85 )
		{
			result = 90;
		}
		else if(percentage > 70 && percentage <= 85)
		{
			result = 80;
		}
		else if(percentage >= 65 && percentage <= 70 )
		{
			result = 70;
		}
		else
		{
			result = 60;
		}
		return result;
	}








	@Override
	public String toString() {
		return "HistoryStudents [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", studentName="
				+ studentName + ", studentClass=" + studentClass + "]";
	}

	
	

}
