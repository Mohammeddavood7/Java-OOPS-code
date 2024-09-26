package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class sixteenDayDoubleArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array base size: ");
		int baseIndex = sc.nextInt();
		System.out.print("Enter the Array sub size: ");
		int subIndex = sc.nextInt();
		
		int arr[][] = new int[baseIndex][subIndex];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter the elements ["+i+"] ["+j+"] : ");
				arr[i][j] = sc.nextInt(); 
			}
			
		}
		
		for(int array[]: arr)
		{
			System.out.println(Arrays.toString(array));
			
		}
		
	}

}
