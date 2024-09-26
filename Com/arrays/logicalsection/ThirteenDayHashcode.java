package Com.arrays.logicalsection;

import java.util.Objects;

class Student1
{
    private int studentId;
    private String studentName;
	public Student1(int studentId, String studentName) {
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
	public int hashCode() {
		return Objects.hash(studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
	
	
	
  
    
}




class Employee1
{
	private int empId;
	private String empName;
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	
	
	
}




public class ThirteenDayHashcode 
{

	public static void main(String[] args)
	{
		String str1 = new String ("bana");
		String str2 = new String ("bana");
		
		System.out.println(System.identityHashCode(str1)+" & "+System.identityHashCode(str2));
		System.out.println(str1==str2);
		System.out.println(System.identityHashCode(str1)==System.identityHashCode(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()+"      "+str2.hashCode());
//		Student1 s1 = new Student1(111, "scott");
//		Student1 s2 = new Student1(111, "scott");
//		
//	    //Employee1 e = new Employee1(0, null);	
//	    
//	    System.out.println(s1.hashCode()+" & "+s2.hashCode());
//	    System.out.println(s1==s2);
//	    System.out.println(System.identityHashCode(s2)+" && "+System.identityHashCode(s1));
//	    
//	    System.out.println(s1.equals(s2));
		
		
		
		
	}
}































