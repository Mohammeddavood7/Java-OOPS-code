
package Com.march12.classCheckednUnchecked;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidMarks extends Exception
{
	  public static void show()
	  {
		  System.out.println();
	  }
      public InvalidMarks()
      {
    	  super();
      }
      public InvalidMarks(String errorMessage)
      {
    	  super(errorMessage);
      }
      
      
    
}

public class Invalid
{
	  public static void main(String[] args) throws Exception
 	   {
 		//InvalidMarks im = new InvalidMarks();
 		//show();
 		Scanner sc = new Scanner(System.in);
 		try(sc)
 		{
 			System.out.print("Enter the Marks: ");
 			int marks = sc.nextInt();
 			
 			if(marks > 100)
 			{
 				throw new InvalidMarks("INVALID MARKS");
 			}
 			else {
 				System.out.println("Marks has considered...");
 			}
 		}
 		catch(InvalidMarks e)
 		{
 			System.err.println(e.getMessage());
 		}
 		
 		
 	}
}












































