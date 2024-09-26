package Com.feb07.finalkeyword;

public class FinalALLConstructor
{
	
	final int A;
	static final int B =9;
	
	public FinalALLConstructor()
	{
	   A = 39;
	   System.out.println(A+"\n"+FinalALLConstructor.B);
	}
	
	public FinalALLConstructor(final int x)
	{
		A = x;
		int a = x;
		System.out.println(x+" & "+a);
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		 new FinalALLConstructor();
		 new FinalALLConstructor(88);
		
	}
	

}
