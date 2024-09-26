package TryWithResources;

public class NestedTryBlock
{
	public static void main(String[] args)
	{
		try
		{
			String str = null;
			System.out.println(str.length());
				
				try
				{
					String str1 = "1";
					int num = Integer.parseInt(str1);
					System.out.println(num);
					
				}
				catch(Exception e)
				{
					System.err.println("provide appropriate input...");
				}
			
		}
		catch(Exception e)
		{
			System.err.println("class with null always gives error..");
		}
		
	}

}
