package Com.arrays.logicalsection;

import java.util.Arrays;

//Given an array of integers,swap the first and last elements in the array. 
//Return the modified array.The array length will be at least 1. 

public class SevenDay5 
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,4,5,6};
		
		int[] firstLast = SevenDay5.firstLast(arr);
		System.out.println(Arrays.toString(firstLast));

	}
	
	public static int[] firstLast(int a[])
	{
		int b[] = new int[] {a[0],a[5]};
		for(int i=0;i<a.length;i++)
		{ 			
			   if(b.length<2)
			   {
				   if(b.length<1)
				   {
					   System.out.println("0");
				   }
				   else
				   {
					   return b;
				   }
			   }
			   else
			   {
				   return b;    
			   }
			   
			}
		return b;
		
		
	}

}


//package com.arrays.logicalsection;
//
//import java.util.Arrays;
//
//public class SevenDay5 {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6};
//
//        int[] firstLast = firstLast(arr);
//        System.out.println(Arrays.toString(firstLast));
//    }
//
//    public static int[] firstLast(int a[]) {
//        if (a.length >= 1) {
//            int temp = a[0];
//            a[0] = a[a.length - 1];
//            a[a.length - 1] = temp;
//        }
//        return a;
//    }
//}

