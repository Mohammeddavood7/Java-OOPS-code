package Com.feb22.labtaskByown;

class TryOnTypeParameter <T>
{
	 T var;
	
	public TryOnTypeParameter(T taker)
	{
		this.var = taker;
		
	}

}

public class SuperSuper
{
	public static void main(String[] args)
	{
		TryOnTypeParameter<Shoping> typeParameter = new TryOnTypeParameter<Shoping>(new Shoping(111,"jeansMediumFit"));
		System.out.println(typeParameter.var);
		
	}
}

record Shoping(int prodId,String prodName)
{
	
}




















































