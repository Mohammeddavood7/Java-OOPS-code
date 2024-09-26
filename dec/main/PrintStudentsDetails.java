package dec.main;

import dec.reuse.StudentDetailsBlc;

public class PrintStudentsDetails {

	public static void main(String[] args)
	{
		StudentDetailsBlc student = new StudentDetailsBlc();
		student.setStudentData(123,"smith",63);
		String studentData = student.getStudentData();
		System.out.println(studentData);
		student.calculateStudentMarks();
		System.out.println("Grade of the Student: "+student.calculateStudentMarks());
		

	}

}
