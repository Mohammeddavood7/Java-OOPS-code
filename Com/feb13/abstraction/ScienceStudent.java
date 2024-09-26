package Com.feb13.abstraction;

public class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	public ScienceStudent(String studentName, String studentClass, int totalNoOfStudents, int physicsMarks,
			int chemistryMarks, int mathsMarks) {
		super(studentName, studentClass, totalNoOfStudents);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	
	
	
	
	@Override
	public int getPercentage()
	{
		int result = 0;
		int total = getPhysicsMarks()+getChemistryMarks()+getMathsMarks();
		int percentage = (total%300)*100;
		
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




	public int getPhysicsMarks() {
		return physicsMarks;
	}




	public int getChemistryMarks() {
		return chemistryMarks;
	}




	public int getMathsMarks() {
		return mathsMarks;
	}




	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
	
	


}





































