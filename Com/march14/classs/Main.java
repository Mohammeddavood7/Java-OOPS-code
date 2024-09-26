package Com.march14.classs;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidUnitsConsumedException extends Exception 
{
	 public InvalidUnitsConsumedException(String message) 
	 {
	     super(message);
	 }
}


class ElectricityBill 
{
	
  //private int unitsConsumed;
    private double billAmount;

 
 public void calculateBill(int unitsConsumed) throws InvalidUnitsConsumedException
 {
     if (unitsConsumed < 0) 
     {
         throw new InvalidUnitsConsumedException("Invalid units consumed. Units consumed cannot be negative.");
     }

    // this.unitsConsumed = unitsConsumed;

     if (unitsConsumed <= 100)
     {
         billAmount = Math.max(50.0, unitsConsumed * 1.50);
     } 
     else if (unitsConsumed <= 200)
     {
         billAmount = Math.max(50.0, 100 * 1.50 + (unitsConsumed - 100) * 2.00);
     } 
     else 
     {
         billAmount = Math.max(50.0, 100 * 1.50 + 100 * 2.00 + (unitsConsumed - 200) * 2.50);
     }
 }
	
	 public void displayBill() 
	 {
	     System.out.println("Bill Amount: Rs. " + billAmount);
	 }
}

public class Main 
{
 public static void main(String[] args)
 {
     Scanner scanner = new Scanner(System.in);

     try 
     {
         System.out.print("Enter units consumed: ");
         int unitsConsumed = scanner.nextInt();

         ElectricityBill electricityBill = new ElectricityBill();
         electricityBill.calculateBill(unitsConsumed);
         electricityBill.displayBill();
         
     }
     catch (InvalidUnitsConsumedException e)
     {
         System.out.println("Error: " + e.getMessage());
     } 
     catch (Exception e)
     {
         System.out.println("Error: Invalid input.");
     }
     finally 
     {
         scanner.close();
     }
 }
}


















































