package jan_8_ClassAsReturnTypeOfMethod;

public class UsingSetterStudentData
{
	private int studentId;
	private String studentName;
	
	public UsingSetterStudentData(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "UsingSetterStudentData [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
	
	

}
