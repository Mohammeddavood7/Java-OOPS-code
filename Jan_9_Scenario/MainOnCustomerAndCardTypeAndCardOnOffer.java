package Jan_9_Scenario;

import java.util.Scanner;

public class MainOnCustomerAndCardTypeAndCardOnOffer 
{
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Name: ");
    
    String customerName = sc.nextLine();
    System.out.print("Enter the CardPoints:");
    int creditPts = sc.nextInt();
    
	Customer c1 = new Customer(customerName, creditPts);
	 CardType card = CardsOnOffer.getOfferCard(c1);
	 System.out.println(card);
	 sc.close();
	}

}
