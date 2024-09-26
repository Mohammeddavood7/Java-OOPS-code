	package InterView;
	
	public class StringCode
	{
		public static void main(String[] args)
		{
			String s = "abcabcd";

			int [] charCounts = new int[256];
			 
			for(int i=0 ;i<s.length(); i++)
			{
				charCounts[s.charAt(i)]++;
				
			}
			
			for(int i=0; i<256; i++)
			{
				if(charCounts[i]!=0)
				{
					System.out.println("Character '"+(char)i+"' occurs: "+charCounts[i]+" times");
					
				}
			}
			
		}
	
	}

	
	