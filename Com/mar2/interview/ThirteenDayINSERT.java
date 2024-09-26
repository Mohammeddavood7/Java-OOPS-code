package Com.mar2.interview;

import java.util.Arrays;
import java.util.Scanner;

public class ThirteenDayINSERT {
    
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements to insert: ");
        int insert = sc.nextInt();
        
        int[] newArr = Arrays.copyOf(arr1, arr1.length + insert);
        System.out.println(Arrays.toString(newArr));
        
        System.out.print("Enter the index where you want to insert the element: ");
        int eleInsert = sc.nextInt();
        
        if (eleInsert < 0 || eleInsert > newArr.length)
        {
            System.out.println("Invalid index!");
            return;
        }
        
        // Shifting elements to make room for insertion
        for (int i = newArr.length - 1; i > eleInsert; i--)
        {
            newArr[i] = newArr[i - 1];
        }
        
        // Inserting the element at the specified index
        System.out.print("Enter the element to insert: ");
        int insertNum = sc.nextInt();
        newArr[eleInsert] = insertNum;
        
        System.out.println(Arrays.toString(newArr));
    }
}

