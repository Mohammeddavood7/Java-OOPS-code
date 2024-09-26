package Com.arrays.Task;



import java.util.Arrays;
import java.util.Scanner;

public class ArraysInsert
{
	static Scanner sc = new Scanner(System.in);
	public static void insertElement(int arr[])
	{
		System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.print("How many element want to insert: ");
        int howMany1 = sc.nextInt();
        
		int newArr[] = Arrays.copyOf(arr, arr.length+howMany1);
		int index = newArr.length-1;
		
		System.out.print("First which index you want to insert: ");
		int indetToEnter = sc.nextInt();//2
		
		for(int i=newArr.length-1;i>=indetToEnter;i--)   
		{
			newArr[index] = newArr[i-1];
			
			index--;
		}

		
		System.out.print("How many element want to insert '"+(index+1)+"'  onwards : ");
        int howMany = sc.nextInt();
		for(int i = index;i<=howMany+1;i++)
		{
			System.out.print("Enter '"+(i+1)+"' Element: ");
			newArr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(newArr));	
		
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1,8,7,10}; 
		ArraysInsert.insertElement(arr);
		
	}

}










































