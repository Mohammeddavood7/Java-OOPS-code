package InterView;

public class StringVariable
{
	
	    public static void main(String[] args)
	    {
	        String s = "abcabcd";

	        // Define an array to store character counts
	        int[] charCounts = new int[256]; // Assuming ASCII characters

	        // Count the occurrences of each character
		        for (int i = 0; i < s.length(); i++)
		        {
		            charCounts[s.charAt(i)]++;
		        }

	        // Print the character counts
		        for (int i = 0; i < 256; i++) 
		        {
		            if (charCounts[i] > 0)
		            {
		                System.out.println("Character '" + (char) i + "' occurs " + charCounts[i] + " times.");
		            }
		        }
	    }
}

