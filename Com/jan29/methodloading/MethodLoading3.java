package Com.jan29.methodloading;

public class MethodLoading3
{
	public Object printNumber(Object ...x)
	{ 
		String str= "";
		
		for(Object o : x)
		{
			str += o +", ";
		}	
		return str;	
	}
	
	public static void main(String []args)
	{
		MethodLoading3 ml = new MethodLoading3();
		
		Object printNumber = ml.printNumber(3,33223222332l,323233.44,33344.5,'A',"In String OverLoading");
		System.out.println(printNumber);
	}

}
