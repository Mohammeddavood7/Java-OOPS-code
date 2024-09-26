package Com.arraysDay5.task;


public class FindMaxDifference {
    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 13, 2};
        findMaxDiff(arr);
    }

    public static void findMaxDiff(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int minElement = arr[0];
        int maxDifference = arr[1] - arr[0];
        int minIndex = 0;
        int maxIndex = 1;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] - minElement > maxDifference)
            {
                maxDifference = arr[i] - minElement;
                maxIndex = i;
            }
            
            if (arr[i] < minElement) 
            {
                minElement = arr[i];
                minIndex = i;
            }
        }

        System.out.println("The elements which provide maximum difference are: " + arr[minIndex] + ", " + arr[maxIndex]);
        System.out.println("The Maximum difference between two elements in the array is: " + maxDifference);
    }
}
