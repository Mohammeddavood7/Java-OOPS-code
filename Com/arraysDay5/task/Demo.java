package Com.arraysDay5.task;


public class Demo {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 5, 7, 3, 2, 4, 1, 6, 2};
        int[] uniqueElements = findUnique(arr);
        
        System.out.println("Unique Elements in the given array are:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findUnique(int[] arr) {
        // Find the maximum element in the array
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Create a frequency array to count occurrences of each element
        int[] freq = new int[max + 1];
        for (int num : arr) {
            freq[num]++;
        }

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create an array to store unique elements
        int[] uniqueElements = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                uniqueElements[index++] = i;
            }
        }

        return uniqueElements;
    }
}
