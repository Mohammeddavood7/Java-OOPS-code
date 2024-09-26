package InterView;

public class Sample
{
	public static int m1(int a,int b)
	{
		return a+b-++a*-b*a+++b;
	}
	
//	public static int m2(int a,int b)
//	{
//		return a-b+-a-++b*a-b; 
//	}
	
	public static void main(String[] args)
	{

//		for(int i=m2(9,1);i<=m1(6,1);i++)
//		{
//			System.out.println("hi chandu");
//			
//		}
		
		//System.out.println(m2(9,1));
		
	
		    //public static void main(String[] args) {
		        String s = "012ch47";
		        
		        // Remove non-numeric characters
		        String numericPart = s.replaceAll("[^\\d]", "");
		        
		        // Parse the numeric part into an integer
		        int number = Integer.parseInt(numericPart);
		        
		        // Add 100 to the number
		        int result = number + 100;
		        
		        System.out.println("Result: " + result);
		        System.out.println("--------------------------------");
		        System.out.println(Sample.m1(6,1));
		    }
}

