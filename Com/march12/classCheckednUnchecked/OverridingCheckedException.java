package Com.march12.classCheckednUnchecked;

import java.io.*;
class Super
{
	public void m1() throws FileNotFoundException
	{
		System.out.println("super m1 is executed..");
	}

}
class Sub extends Super
{
	@Override
	public void m1() throws FileNotFoundException
	{
		System.out.println("sub m1 is executed..");
	}
}

public class OverridingCheckedException 
{
	public static void main(String[] args) throws Exception
	{
		Sub s = new Sub();
		s.m1();
	}
}




















































































