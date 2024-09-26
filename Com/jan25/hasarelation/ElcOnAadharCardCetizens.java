package Com.jan25.hasarelation;

public class ElcOnAadharCardCetizens 
{
	public static void main(String[] args)
	{
		AadharCard ac = new AadharCard("123456789011", "udai");
		Cetizens c = new Cetizens("Hyderabad", "scott",ac);
		
		String display = c.display();
		System.out.println(display);
		System.out.println(c);
	
	
	}
}
