package Com.mar7.examTest;

import java.util.Arrays;

public class Extra1
{
	public static int[] incrementLargeInteger(int[] digits) 
    {
        
        
        for (int i = digits.length-1; i >= 0; i--) 
        {
            if (digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        return digits;
    }
	
	
    public static void main(String[] args) 
    {

        int[] digits2 = {4,3,2,1};
        int[] result2 = incrementLargeInteger(digits2);
        System.out.println(Arrays.toString(result2));
    }

    

}
























//public static void printArray(int[] arr) 
//{
//  System.out.print("[");
//  
//  for (int i = 0; i < arr.length; i++) 
//  {
//      System.out.print(arr[i]);
//      if (i < arr.length - 1)
//      {
//          System.out.print(", ");
//      }
//  }
//  
//  System.out.println("]");
//}
































