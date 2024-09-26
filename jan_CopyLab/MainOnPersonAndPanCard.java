package jan_CopyLab;

public class MainOnPersonAndPanCard {

	public static void main(String[] args)
	{
		PanCard pan = new PanCard();
		Person p1 = new Person(pan,"Smith", "Hyderabad", 9876543217l,"Telangana");
		System.out.println("PANCARD NUMBER: "+p1.display());
		System.out.println(p1);

		

	}

}
