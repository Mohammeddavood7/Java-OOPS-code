package dec_18;

import java.util.Scanner;

public class ProfitAndLoss
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the orginal price");
		double cp = obj.nextDouble();
		System.out.println("Enter the Selling price");
		double sp = obj.nextDouble();
		double pt = sp - cp;
        double ls = cp - sp;
        
        if(pt>0)
        {
		double pt1 = (pt/cp)*100;
		System.out.println("profit: "+pt);
		System.out.println("Profit Percantage: "+pt1);
        }
        else
        {
        	double ls1 = (ls/cp)*100;
        	System.out.println("Loss: "+ls);
        	System.out.println("loss Percantage: "+ls1);
        }
        
	}

}
