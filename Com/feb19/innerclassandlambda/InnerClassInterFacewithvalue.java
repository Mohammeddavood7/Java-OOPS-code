package Com.feb19.innerclassandlambda;

interface Beta
{
	int doSum(int a,int b);

}

public class InnerClassInterFacewithvalue
{
	public static void main(String[] args)
	{
		Beta beta = (a,b) ->
		{
			return a*b;
		};
		
		System.out.println(beta.doSum(3, 3));
		  
	}
}





//(a,b) -> a+b;
//System.out.println(beta.doSum(100,50));//beta.doSum(100,50);








//(a,b) -> System.out.println((a+b));
//beta.doSum(100,50);



//	new Beta()
//	{
//		public void doSum(String str)
//		{
//			System.out.println(str);
//			
//		}
//	};
//	b.doSum("red");
//}