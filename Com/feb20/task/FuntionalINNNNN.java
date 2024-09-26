package Com.feb20.task;

class Super <T>
{
	private T var;	
	
	public Super(T a)
	{
		this.var = a;
	}
	
	public T getNum()
	{
		return var;
	}
	
}

public class FuntionalINNNNN
{
	public static void main(String[] args)
	{
		Super<Integer> typeInt = new Super<Integer>(24);	
	    System.out.println(typeInt.getNum());
		  
		  
		Super<Float> typeFloat = new Super<Float>(24.0f);	
		System.out.println(typeFloat.getNum());
		  
		
		Super<Character> typeChar = new Super<Character>('A');	
		System.out.println(typeChar.getNum());
		
		Super<Double> typeDouble = new Super<Double>(50.0);
		System.out.println(typeDouble.getNum());
		
		
		Super<typeParameter> typePm = new Super<typeParameter>(new typeParameter(111,"Smith"));
		
		System.out.println(typePm.getNum());
		
		Super<Sub> subType = new Super(new Sub(222,"Warner"));
		System.out.println(subType.getNum());
		
		
	}
}

record typeParameter(int id,String name)
{
	
}

class Sub
{
	int id ;
	String name;
	public Sub(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
    @Override	
	public String toString()
	{
	   return "Sub:    "+"id :"+id+", name: "+name;
	}
}







































