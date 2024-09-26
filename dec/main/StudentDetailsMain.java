package dec.main;

import dec.reuse.StudentDetailsOfBlcFile;

public class StudentDetailsMain 
{
	public static void main(String[] args)
	{
		StudentDetailsOfBlcFile studentDetail = new StudentDetailsOfBlcFile();
		studentDetail.setStudentsDate(111, "Scott");
		String string = studentDetail.toString();
		System.out.println(string+"\n..............................................");
		
		StudentDetailsOfBlcFile student2Detail = new StudentDetailsOfBlcFile();
		student2Detail.setStudentsDate(222, "Smith");
		String string1 = student2Detail.toString();
		System.out.println(string1+"\n..............................................");		
		
		StudentDetailsOfBlcFile student3Detail = new StudentDetailsOfBlcFile();
		student3Detail.setStudentsDate(333, "Warner");
		String string2 = student3Detail.toString();
		System.out.println(string2+"\n..............................................");
	}

}
