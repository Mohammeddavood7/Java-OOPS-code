package Com.mar1.fornameCLASS;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter String check palindrome or not: ");
        String str = sc.nextLine();
        
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        // Loop from the start to the middle of the string
        for (int i = 0; i < str.length() / 2; i++) {
            // Compare characters from the start and end of the string
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false; // Not a palindrome
            }
        }
        // If the loop completes without returning false, it's a palindrome
        return true;
    }
}
