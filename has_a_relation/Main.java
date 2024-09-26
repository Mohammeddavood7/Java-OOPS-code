package has_a_relation;

public class Main 
{

	public static void main(String[] args) 
	{
		Student stud1 = new Student(111,"Scott",20000);
	
		stud1.setStudentFees(39999);
		College coll1 = new College("GNITC", "IBRAHIMPATNAM HYDERABAD", stud1);
		
		coll1.m1();
		System.out.println(coll1);
		
		Student stud2 = new Student(222, "Smith", 59999);
		College coll2 = new College("CVR", "MANGALPALLI", stud2);
		System.out.println(coll2);
		
		
      
		
	}

}
