package Com.feb07.finalkeyword;

import java.util.Scanner;

final class FinalKeyword 
{
	private final String AADHARCARD;

	public FinalKeyword(String aadharCard)
	{
		super();
		
		if(aadharCard.length() == 12)
		{
			this.AADHARCARD = aadharCard;
		   System.out.println("Valid Aadhar Number: "+AADHARCARD);	
		}
		else
		{
		    this.AADHARCARD = aadharCard;
			System.err.println("Invalid Aadhar Number: "+AADHARCARD);
		}
		
	}
	
	public String getAadharCard()
	{
				return AADHARCARD;
	}
     
	
	
//	@Override
//	public String toString() {
//		return "FinalKeyword [AADHARCARD=" + AADHARCARD + "]";
//	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the AadharCard Number: ");
        String aadharNumber = sc.next();
      final  FinalKeyword fk =new FinalKeyword(aadharNumber);
	     sc.close();	
		
		
	}

}
