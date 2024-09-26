package Com.arrays.Task;

public class ArrayReverse
{
	public static void main(String[] args)
	{
		int [] arr = {2,5,7};// 2 5 7 => length(3) arr.length-1(3-1)=2
		           // 0 1 2 --index              
		for(int i=arr.length-1; i>=0 ;i-- ) //i=0;i<arr.length;i++  0 1 2 		                       
		{
			System.out.println(arr[i]);  //7 5 2
		}
		
	}

}
