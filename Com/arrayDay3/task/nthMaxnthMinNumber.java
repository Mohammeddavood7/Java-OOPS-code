package Com.arrayDay3.task;

import java.util.Arrays;

public class nthMaxnthMinNumber {
	public static void nthMax(int arr[], int max)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

//			if (i == max - 1) {
//				System.out.println(i + "Maxmimum Number is: " + arr[i]);
//				break;
//			}
		}
		int count = 0;    //8, 7, 7, 7, 5, 4, 4, 4, 3, 2, 1, 1
		for (int i = 0; i < arr.length - 1; i++) 
		{
			if (arr[i] > arr[i + 1]) 
			{
				count++;    
			}
			
			if (count == max)
			{
				System.out.println(max + "  Max " + arr[i]);
				break;
			}
			
		}

		System.out.println(Arrays.toString(arr));

	}

	public static void nthMin(int arr[], int min) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		int count=0;  
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				count++;
			}
			if (count == min) {
				System.out.println(min + "  Min " + arr[i]);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 1, 7, 7, 7, 4, 8, 2, 4, 4, 3 };
		int max = 3;
		nthMaxnthMinNumber.nthMax(arr, max);
		int min = 4;
		nthMaxnthMinNumber.nthMin(arr, min);

	}

}
