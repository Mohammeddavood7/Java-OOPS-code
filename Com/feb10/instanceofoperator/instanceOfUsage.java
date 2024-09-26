package Com.feb10.instanceofoperator;



class Employee
{
	private Integer studentId;
	private String studentName;
	public Employee(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	@Override
	public String toString() {
		return "Employee [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}


class Student
{
	private int studentId;
	private String studentName;
	
	
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}



	@Override
    public boolean equals(Object obj)
	{
		//Employee emp =(Employee) obj;
		if(obj instanceof Student)
		{
			Student stud1 =(Student)obj;
		     
			if(this.studentId == emp.getStudentId() && this.studentName.equals(emp.getStudentName()))
			{
				return true;
			}
			else
			{
				System.err.println("Comparison Invalid ");
				return false;
			}
		}
		else
		{
			System.err.println("its different class");
			return false;
		}
	}
	
}
public class instanceOfUsage 
{
	public static void main(String[] args)
	{
		Employee e = new Employee(222,"Smith");
		Student s1 = new Student(222, "Smith");
		
		Student s2 = new Student(222, "Smith");
		Student s3 = new Student(333, "Scott");
		Student s4 = new Student(444, "Scott");


		 
		boolean b = s1.equals(e);
		System.out.println(b);
	
		
	
				
			
		
	}

}





































