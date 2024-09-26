package Com.mar1.fornameCLASS;

import java.util.Scanner;

public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int rev = 0;
		int orgNum = num;
		while(num != 0)
		{
			rev = rev * 10 + num%10;    //reversedNum = reversedNum * 10 + digit;
			num /= 10;
		}
	     
		if(orgNum==rev)
		{
			System.out.println("it is a palindrome number");
		}
		else
		{
			System.out.println("its not a palindrome number");
		}
		
		
	}

}
