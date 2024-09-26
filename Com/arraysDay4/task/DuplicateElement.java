package Com.arraysDay4.task;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 3};
        int elementToRemove = 3;

        System.out.println("Original Array: " + Arrays.toString(array));

        // Count the occurrences of the element to remove
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == elementToRemove)
            {
                count++;
            }
        }

        if (count > 0)
        {
            // Create a new array with size equal to the original array minus the count of the element to remove
            int[] newArray = new int[array.length - count];

            // Copy elements from the original array to the new array, skipping the element to remove
            for (int i = 0, j = 0; i < array.length; i++) 
            {
                if (array[i] != elementToRemove) 
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























































