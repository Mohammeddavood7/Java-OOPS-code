package Com.feb08.ObjectClass;

import Com.jan24_1.Employee;

public class Student
{
	
	@Override
	public String toString()
	{
		return getClass().getClass()+"@"+Integer.toHexString(hashCode());
	}
	
	
	public String toString1()
	{
		return getClass().getName();
	}
	
	public static void main(String[] args)
	{
		Student s = new Student();
		Class name = s.getClass();
		System.out.println(name);
		//System.out.println(s.getClass());
		Employee e = new Employee();
		Employee e1;
		//System.out.println(e1);
		Employee e3 = new Employee();
		e1 = e3;
		e3 = e1;
		e3 = e;
		
		
		
		System.out.println(e.hashCode());
		
		System.out.println(e);
		
		System.out.println(e.toString());
		
	//	public native Class getClass();
		
		System.out.println(s.toString1());
		
		
	}

}
