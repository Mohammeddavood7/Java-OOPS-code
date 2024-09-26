package Com.arraysDay4.task;

import java.util.Arrays;

public class RemoveElementFromArray 
{
    public static void main(String[] args) 
    {
        int[] array = {1, 2, 3,, 4, 5};
        int elementToRemove = 3;

        System.out.println("Original Array: " + Arrays.toString(array));

        // Find the index of the element to remove
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == elementToRemove)
            {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1)
        {
            // Create a new array with size one less than the original array
            int[] newArray = new int[array.length - 1];

            // Copy elements from the original array to the new array, skipping the element to remove
            for (int i = 0, j = 0; i < array.length; i++)
            {
                if (i != indexToRemove) 
                {
                    newArray[j++] = array[i];
                }
             }

            array = newArray;
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
        } 
        else 
        {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        }
    }
}






















































