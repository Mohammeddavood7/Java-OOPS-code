package Com.feb19.innerclassandlambda;


class Super
{
	public void show()
	{
		//System.out.println("show executed");
	}
}



public class InnerClass
{

	public static void main(String[] args) 
	{
		Super sub = new Super()
	    {
		    public void show()
		    {
		      System.out.println("show method is executed");	
		    }
		    
		    public void show1()
		    {
		      System.out.println("show method is executed");	
		    }
		    
	    };
	    
	    sub.show();
		
	}
	

}
