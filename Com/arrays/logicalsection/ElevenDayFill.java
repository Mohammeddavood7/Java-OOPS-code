package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class ElevenDayFill 
{
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6};
		int newArr[] = new int[arr.length]; 
		int index=0;
		System.out.print("Enter the index to reverse: ");
		int userNum = sc.nextInt();
		for(int i=userNum;i<arr.length;i++)
		{
//			if(i>=userNum)
//			{
				newArr[index] = arr[i];
				index++;
			//}
			
		}
		
		for(int i=0;i<userNum;i++)
		{
			newArr[index] = arr[i];
			index++;
			
		}
		
		System.out.println(Arrays.toString(newArr));
		
		
	}
	

}
