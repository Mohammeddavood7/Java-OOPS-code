package Com.mar7.examTest;

public class IncrementLargeInteger
{
	
	public static int[] show(int arr[])
	{
		int res[] = new int[arr.length];
		int count = arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
        	
        	if(i == count)
        	{
        		//System.out.print(arr[i]+1);
        	      res[i] = arr[i]+1;
        	}
        	else 
        	{
        		//System.out.println(arr[i]);
        		res[i] = arr[i];
			} 
        
        }
        
        return res;
	}
	
	
	public static void main(String[] args)
	{
        int arr [] = {4,3,2,9};
        int[] show = IncrementLargeInteger.show(arr);
        //System.out.println(Arrays.toString(show));
        for(int s : show)
        {
        	System.out.print(s);
        }
        
        
	}  
	
        
	

}
