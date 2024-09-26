
package Com.march14.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.print("Enter the age: ");
			int nextInt = sc.nextInt();
			System.out.println("Age: "+nextInt);
			
		}
		catch(InputMismatchException e)
		{
			System.err.println("provide correct input Number only...");
		}
		
	}

}



import java.util.Scanner;

class InvalidUnitsConsumedException extends Exception {
 public InvalidUnitsConsumedException(String message) {
     super(message);
 }
}

class ElectricityBill {
 private double billAmount;

 public void calculateBill(int unitsConsumed) throws InvalidUnitsConsumedException {
     if (unitsConsumed < 0) {
         throw new InvalidUnitsConsumedException("Units consumed cannot be negative");
     }

     if (unitsConsumed <= 100) {
         billAmount = Math.max(50, unitsConsumed * 1.50);
     } else if (unitsConsumed <= 200) {
         billAmount = Math.max(50, 100 * 1.50 + (unitsConsumed - 100) * 2.00);
     } else {
         billAmount = Math.max(50, 100 * 1.50 + 100 * 2.00 + (unitsConsumed - 200) * 2.50);
     }
 }

 public void displayBill() {
     System.out.println("Electricity Bill Amount: Rs. " + billAmount);
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     ElectricityBill billCalculator = new ElectricityBill();

     try {
         System.out.print("Enter the number of units consumed: ");
         int unitsConsumed = scanner.nextInt();

         billCalculator.calculateBill(unitsConsumed);
         billCalculator.displayBill();
     } catch (InvalidUnitsConsumedException ex) {
         System.out.println("Error: " + ex.getMessage());
     } catch (Exception ex) {
         System.out.println("Error: Invalid input.");
     } finally {
         scanner.close();
     }
 }
}
