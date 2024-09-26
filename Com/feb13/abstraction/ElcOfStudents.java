package Com.feb13.abstraction;

public class ElcOfStudents
{
	public static void main(String[] args)
	{
		Student s ;
		
		s = new ScienceStudent("Suraj", "10th class", 60, 100, 80, 80);
		int percentage = s.getPercentage();
		System.out.println("This student got : "+percentage+"%");
		
		s = new HistoryStudents("mouli", "10 th class ", 60, 80, 80);
		int percentage2 = s.getPercentage();
		System.out.println("This student got : "+percentage2+"%");

		
	}

}
