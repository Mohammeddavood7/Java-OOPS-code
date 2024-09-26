package Com.march11.Exception;

public class HandleNullPointerException
{
	
	public void display(int a ,int b)
	{
		System.out.println("Addition 2Num: "+(a/b));
	}
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		HandleNullPointerException h = null; // new	HandleNullPointerException();
		
		if(h != null)
		{
			h = new  HandleNullPointerException();
			h.display(11,11);
			
		}
		else
		{
			h.display(11,0);
		}
		
		
		
		
	}

}
