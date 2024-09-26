package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class ElevenDayfillwithpredefined
{
	
	public static void main(String[] args)
	{
		int arr1[] = {1,2,3,4,5,6};
//		ElevenDayfillwithpredefined efm = new ElevenDayfillwithpredefined();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element rewrite all element: ");
		int ele = sc.nextInt();
		Arrays.fill(arr1, ele);
		System.out.println(Arrays.toString(arr1));
		System.out.println("==========================================");
		
		int array2[] = {1,2,3,4,5,6,7,8,9};
		System.out.print("Enter starting index: "); 
		int start = sc.nextInt();
		System.out.print("Enter ending index: ");
		int end = sc.nextInt();
		System.out.print("Enter the element rewrite all element: ");
		int element = sc.nextInt();
	    Arrays.fill(array2, start, end, element);
		System.out.println(Arrays.toString(array2));
		
	}

}
