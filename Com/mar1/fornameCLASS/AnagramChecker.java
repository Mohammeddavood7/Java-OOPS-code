package Com.mar1.fornameCLASS;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Convert strings to lowercase to make the comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Remove spaces if necessary
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
}
