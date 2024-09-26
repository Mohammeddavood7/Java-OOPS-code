package Com.arraysDay4.task;

import java.util.Arrays;

public class InsertElementsIntoArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] elementsToInsert = {6, 7, 8};
        int indexToInsert = 2;

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Elements to insert: " + Arrays.toString(elementsToInsert));
        System.out.println("Index to insert: " + indexToInsert);

        // Calculate the size of the new array
        int newSize = originalArray.length + elementsToInsert.length;

        // Create a new array with the new size
        int[] newArray = new int[newSize];

        // Copy elements from the original array up to the index where we want to insert
        System.arraycopy(originalArray, 0, newArray, 0, indexToInsert);

        // Copy elements to insert into the new array
        System.arraycopy(elementsToInsert, 0, newArray, indexToInsert, elementsToInsert.length);

        // Copy the remaining elements from the original array
        System.arraycopy(originalArray, indexToInsert, newArray, indexToInsert + elementsToInsert.length,
                originalArray.length - indexToInsert);

        System.out.println("Array after inserting elements: " + Arrays.toString(newArray));
    }
}
