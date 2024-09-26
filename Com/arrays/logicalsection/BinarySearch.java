package Com.arrays.logicalsection;

import java.util.Arrays;

public class BinarySearch 
{
    
    public static void binarySelection(int arr[], int ele) {
        // Step 1: Sort the array
       
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;

            // Check if the element is at the middle
            if (arr[middle] == ele)
            {
                System.out.println("The element found at index: '" + middle + "' and element is: " + arr[middle]);
                return; // Exit after finding the element
            } 
            // If the element is greater, ignore the left half
            else if (arr[middle] < ele) {
                low = middle + 1;
            } 
            // If the element is smaller, ignore the right half
            else {
                high = middle - 1;
            }
        }

        // If the element is not found
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args) {
    	                                     //0 1 2 3 4 5 6 7
        int arr[] = {3, 5, 2, 8, 1,8, 6, 9}; //1 2 3 5 6 8 8 9
        int element = 8;
        binarySelection(arr, element);
    }
}
