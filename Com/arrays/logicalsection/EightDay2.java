package Com.arrays.logicalsection;

public class EightDay2 
{

//
//	public void print01(Integer arr[]) {
//		 for(Integer var: arr) {
//			  System.out.print(var+" ");
//		 }
//	}
//	public void print02(String arr[]) {
//		 for(String var: arr) {
//			  System.out.print(var+" ");
//		 }
//	}
	  public void print(Object ob[])
	  {
		  for(Object o:ob) {
			   System.out.println(o+" ");
		  }
	  }
public static void main(String[] args) {
	EightDay2 p=new EightDay2();
	Integer arr[]= {1,2,3,4};
	String str[]= {"Mahi","chiku","Hitman"};
	p.print(arr);
	p.print(str);
	new EightDay2().print(new Integer[] {1,2,3});
	new EightDay2().print(new String[] {"Mahi","chiku","Hitman"});
	
     }
}
