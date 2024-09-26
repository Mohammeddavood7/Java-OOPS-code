package Com.arrays.logicalsection;

import java.util.Arrays;

/*      
 *      7,3,6,2,8,1
 *      1,3,6,2,8,7
 *      1,2,6,3,8,7
 *      1,2,3,6,8,7
 *      1,2,3,6,8,7
 *      1,2,3,6,7,8
 *      
 *    
 *    
 *      
 *      
 *      
 */
public class EightDaySelection
{
	public void selectionSort(int arr[])
	{ 
		int hold,temp;
	
		for(int i=0; i<arr.length; i++)
		{   //     7,3,6,2,8,1

			hold=i;
			for(int j=i+1; j<arr.length; j++)
			{      //3 //6        //7
				if(arr[j]<arr[i])
				{
					hold = j;//5
					
				}
			}
			temp = arr[i];
			arr[i] = arr[hold];
			arr[hold] = temp;
			
		}
		
		for(int values:arr)
		{
			System.out.print(values+" ");
		}
		
		
	}
	public static void main(String[] args) 
	{
		EightDaySelection eds = new EightDaySelection();
		int arr[] = {7,3,6,2,8,1};
		
	 eds.selectionSort(arr);
	 /* //System.out.println(Arrays.toString(selectionSort));
		//(Arrays.sort(arr));*/
		
	}

}
