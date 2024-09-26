package Com.jan25.hasarelation;

public class ElcOnStudentTrainee
{
	public static void main(String[] args) {
	
	Student s = new Student(111, "Scott", 12000, 25);
	Trainee.display(s);
	System.out.println("----------------------------------------");
	Trainee.display(new Student(222,"Smith",20000,35));
 
	}
}
