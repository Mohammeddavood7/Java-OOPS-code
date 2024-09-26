package Com.mar7.examTest;

import java.util.Arrays;

public class nthMaxnthMinNumber
{
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
			
		}
		//10, 10, 10, 10, 10, 9, 2, 1
		int count = 0;  
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] > arr[i + 1]) {
				count++;
			}
			if (count == max) {
				System.out.println(max + " Largest Num is: " + arr[i]);
				break;
			}
		}

	//	System.out.println(Arrays.toString(arr));

	}


	public static void main(String[] args) {
		int arr[] = { 10, 1, 2, 10, 10, 9, 10, 10 };
		int max = 3;
		nthMaxnthMinNumber.nthMax(arr, max);
		

	}

}
