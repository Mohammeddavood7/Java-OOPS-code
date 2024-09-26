package Com.mar8.TryCatchFinally;

import java.util.Scanner;

public class TryCatchResources
{

     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);		
    	 System.out.println("Main started...");
 
    	 try 
    	 {
    		 System.out.print("Enter the number: ");
    		 int a = sc.nextInt();
    		 System.out.print("Enter the Number: ");
    		 int b = sc.nextInt();
    	     System.out.println("Result: "+a/b); // if here exception encounter then sc.close(): is not going to close 
    	    // sc.close(); 
    	 }
    	 catch(Exception e)
    	 {
    		 System.err.println("number don't divide by zero");
    	 }
    	 finally
    	 {
    		 sc.close();
    	 }
    	 
    	 System.out.println("Main Ended..");
    	 
	 }

}





































