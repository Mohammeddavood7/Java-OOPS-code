package Com.mar7.examTest;

import java.util.Arrays;

public class JavaClass {
 public static void main(String[] args) {
     
     Student[] s = new Student[3];
     s[0] = new Student("Alice", 101);
     s[1] = new Student("Bob", 103);
     s[2] = new Student("Charlie", 102);

  
     System.out.println("Original array of Students:");
     System.out.println(Arrays.toString(s));

     int[] id = new int[s.length];

     for (int i = 0; i < s.length; i++) 
     {
         id[i] = s[i].getStudentId();
     }

     System.out.println("Array of student Id:"+Arrays.toString(id));

     Arrays.sort(id);
     System.out.println("Sorted array of student Id:"+Arrays.toString(id));
 }
}
