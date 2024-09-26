package dec.main;

public class StudentsObjectCreate
{
	String name;
	String roll;
	String address;
	public void talk()//String name
	{
		System.out.println("My name is : '"+name+"' My rollname is:  '"+roll+"'");
	}
	public void writeExam()
	{
		System.out.println("I am '"+name+"' here to give the exam on javaL"+"  I from '"+address+"'");
	}
    public static void main(String[] args) 
	{
		
		
		StudentsObjectCreate raj = new StudentsObjectCreate();
		raj.name = "Raj Kapoor";
		raj.roll = "NIT2023001";
		raj.address = "Hyderabad And Area L.B Nagar";
		raj.talk(); raj.writeExam();
		
		System.out.println("..................................");
		
		StudentsObjectCreate priya = new StudentsObjectCreate();
		priya.name = "priya kumari";
		priya.roll = "NIT2023002";
		priya.address = "Hyderabad And Area Dilsuknagar.";
		
		priya.talk();
		priya.writeExam();
		
		
	}

}
