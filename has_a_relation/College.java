package has_a_relation;

public class College 
{
	private String collegeName;
	private String collegeLocation;
	private Student student;
	
	public College(String collegeName, String collegeLocation, Student student) {
		super();
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		this.student = student;
	}

	public void m1()
	{
		System.out.println("\nstudentFees: "+student.getStudentFees());
	}

	@Override
	public String toString()
	{
		return "College [collegeName=" + collegeName + ", collegeLocation=" + collegeLocation 
				+ ", student=" + student + "]";
		
		
		
	}
	
	
	
	

}
