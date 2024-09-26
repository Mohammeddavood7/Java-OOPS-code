package Com.arrays.logicalsection;

import java.util.Arrays;
import java.util.Scanner;

public class ThirteenDayINSERT 
{
	
	//1,2,3,4,5,6,0
	//1,2,3,4,5,6,6
	//1,2,3,4,5,5,6
	//1,2,3,4,4,5,6
	
	
	// 1,2,3,4,5,6,0,0,0
    // 0,1,2,3,4,5,6,7,8 ---index number
	// 1,2,3,4,5,6,0,0,0
	// 1,2,3,4,6,6,6,0,0
	
	
	
	public static void main(String[] args) 
	{
		int arr1 [] = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element to insert: ");
		int insert = sc.nextInt();
		int[] newArr = Arrays.copyOf(arr1, arr1.length+insert);
		System.out.println(Arrays.toString(newArr));
		System.out.print("Enter element which index you want: ");
		int eleInsert = sc.nextInt();
			
		int index = newArr.length-1;
		for(int i=newArr.length-1;i>eleInsert-1;i--)   
		{
			newArr[index] = newArr[i-1];
			index--;
		}
		System.out.println(Arrays.toString(newArr));
		
		for(int i=index;i<newArr.length;i++)
		{
		System.out.print("Enter Insert Element: ");
		int insertNum = sc.nextInt();
		newArr[index] = insertNum;
		       index++;
		}
		
		System.out.println(Arrays.toString(newArr));
	}

}



































