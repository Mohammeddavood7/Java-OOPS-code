package jan_8_ClassAsReturnTypeOfMethod;

public class MainStudentUsingSetter 
{
	public static void main(String[] args) 
	{
		UsingSetterStudentData student1 = new UsingSetterStudentData(111, "Smith");
		student1.setStudentId(222);
		student1.setStudentName("Scott");
		System.out.println(student1);
		
		UsingSetterStudentData student2 = new UsingSetterStudentData(333,"Warner");
		System.out.println(student2);
		

		
	}

}
