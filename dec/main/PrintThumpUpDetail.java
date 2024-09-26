package dec.main;

import dec.reuse.BuyThumpUpInShop;

public class PrintThumpUpDetail
{
	public static void main(String[] args) 
	{
		BuyThumpUpInShop thumpsup = new BuyThumpUpInShop();
//		thumpsup.drinkName = "ThumsUp Cool Drink";
//		thumpsup.drinkCost = 20;
//		thumpsup.drinkShopeName = "CoCoCoLa Company";
		
		String drinkDetails = thumpsup.getDrinkDetails("ThumsUP Cool Drink","CoCoCoLa Company");
		int drinkCost = thumpsup.getDrinkCost(20);
		System.out.println(drinkDetails);
		System.out.println("ThumpUp Cost: "+drinkCost);
		
		    
	}

}
