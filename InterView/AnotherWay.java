package InterView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnotherWay {
    public static void main(String[] args)
    {
        String text = "Hello 123 World";
        String pattern = "\\d"; // Regular expression to match a single digit

        // Compile the pattern
        Pattern regex = Pattern.compile(pattern);

        // Match the pattern against the text
       Matcher matcher = regex.matcher(text);

        // Find all matches and print them
        while (matcher.find()) {
            System.out.println("Found digit: " + matcher.group());
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        String s = "012ch47";
//        
//        // Remove non-numeric characters from the string
//        String numericString = s.replaceAll("[^0-9]", "");
//        
//        // Convert the numeric string to an integer
//        int sum = 0;
//        try {
//            sum = Integer.parseInt(numericString);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid numeric string");
//        }
//        
//        System.out.println("Sum of numbers in the string: " + sum);
//    }
//}
