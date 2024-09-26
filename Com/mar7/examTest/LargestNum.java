package Com.mar7.examTest;

public class LargestNum 
{
	public static void largestNum(int arr[],int max) 
	{
		int maxx = arr[0];
		
		for(int i=0;i<arr.length;i++)
			if(arr[i] > maxx)
				maxx = arr[i];
		System.out.println(maxx);
	}
	
	public static void main(String[] args)
	{
		int arr[] = {11,10, 10, 10, 10, 10, 9, 2, 1};
		int max = 2;
		LargestNum.largestNum(arr, max);
	}

}
