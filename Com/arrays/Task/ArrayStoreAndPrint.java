package Com.arrays.Task;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStoreAndPrint 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int []arr = new int[size]; //----toString
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter '"+i+"' elements: ");
			arr[i] = sc.nextInt();   // 9 8 7 6 5 4 => size = 6
			                         // 0 1 2 3 4 5 => arrays starts from '0'
		}
		        // arr[i];
		
          System.out.println(Arrays.toString(arr));
		 
		//i=0
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.println(arr[i]); //arr[0];
//		}
          sc.close();
          
          
	}

}
































