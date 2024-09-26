package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdDay
{
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Array size: ");
	int size = sc.nextInt();
	int [] arr = new int[size];
	
	for(int i=0; i<arr.length;i++)
	{
		System.out.print("Enter "+(i+1)+" element: ");
		arr[i] = sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println(Arrays.toString(arr));
	}
}
