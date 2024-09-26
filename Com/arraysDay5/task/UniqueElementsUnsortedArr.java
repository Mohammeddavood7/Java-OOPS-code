package Com.arraysDay5.task;

import java.util.Arrays;

public class UniqueElementsUnsortedArr {

    public static int[] uniqueUnsorted(int arr[]) {

        System.out.println("Original Arrays: " + Arrays.toString(arr));
        int count = 0;
        
        
	       
        
        for (int i = 0; i < arr.length; i++) //1 5 8 7 3 2 4 6
        {
            for (int j = i + 1; j < arr.length; j++)
            {
            	      //5
                if (arr[i] == arr[j])
                {
                    count++; //3 
                    break;
                }
            }
        }
        
        int[] newArr = new int[arr.length - count]; // 1 5 0 0 0 0 0 0
        
        int index = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            boolean isUnique = true;
                                  //7
            for (int j = 0; j < newArr.length; j++) 
            {      
            	
            	// 1, 5, 8, 5,7, 3, 2, 4, 1, 6, 2  
     	        // 0  1  2  3 4  5  6  7  8  9 10   
                if (arr[i] == newArr[j]) 
                {
                    isUnique = false;
                    break;
                }
            }  
            
            if (isUnique) // flag == 0
            {
                newArr[index++] = arr[i]; //  
            }
        }
        

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1,5, 8, 5,7, 3, 2,4, 1, 6, 2};
        int[] uniqueUnsorted = uniqueUnsorted(arr);

        System.out.println("Unique Element are: " + Arrays.toString(uniqueUnsorted));
    }
}



















































