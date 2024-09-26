package dec.main;
import java.util.Scanner;
public class CreateObjectOnEvenAndOdd 
{
	int even;
	boolean getEven()
	{
		return (even%2==0);
	}
	
	public static void main(String[] args) 
	{
		CreateObjectOnEvenAndOdd eo = new CreateObjectOnEvenAndOdd();
		Scanner sc = new Scanner(System.in);
		System.out.print("To check Even or Odd\nEnter the Number: ");
		eo.even = sc.nextInt();
		boolean even2 = eo.getEven();
		System.out.println(even2);
		sc.close();
		
	}

}
