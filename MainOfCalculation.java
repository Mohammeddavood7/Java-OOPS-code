import java.util.Scanner;

public class MainOfCalculation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();
		
		new PrivateConstructor(0, 0);
		int addition =  PrivateConstructor.getAdd(n1, n2);
		int subtraction = PrivateConstructor.getSub(n1, n2);
		String division = PrivateConstructor.getDiv(n1, n2);
		int multiplication = PrivateConstructor.getMul(n1, n2);
		System.out.println("Addition of two number: "+addition);
		System.out.println("subtraction of two number: "+subtraction);
		System.out.println("Division of two number: "+division);
		System.out.println("Multiplication of two number: "+multiplication);
		
		sc.close();
	}

}
