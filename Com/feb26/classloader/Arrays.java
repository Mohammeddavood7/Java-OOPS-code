package Com.feb26.classloader;


import java.util.Scanner;

public class Arrays 
{
	public static void main(String[] args)
	{
	                            // 9 8 7 6 2 7
		int []arr1 = new int[6]; //0,1,2 3,4,5
		//int index = 0; 
		                 //6
		for(int i=0;i<arr1.length;i++) // 0 1 2 3 4 5
		{
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number: ");
			arr1[i] = sc.nextInt();
			                         
		}
		System.out.println("..................");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+", "); 
		}
		
		
		
	}
	
	
}
