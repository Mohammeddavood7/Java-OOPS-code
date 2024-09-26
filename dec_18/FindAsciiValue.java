package dec_18;

import java.util.Scanner;

public class FindAsciiValue {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = obj.nextLine().charAt(0);
        int i = ch;
        System.out.println("The ASCII value of '"+ ch +"' is: " +i);
        obj.close();
    }
}
