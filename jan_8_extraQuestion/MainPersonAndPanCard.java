package jan_8_extraQuestion;

import java.util.Scanner;

public class MainPersonAndPanCard 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the PanId: ");
		String pan = sc.nextLine();
		sc.close();
		new PanCard(pan);
		
	}

}
