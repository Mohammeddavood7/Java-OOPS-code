package dec_18;



public class StringToDouble 
{
//{   
//	public static void main(String[] args) {
//		
//	
//	System.out.println("Enter the two floating number");
//	Scanner obj = new Scanner(System.in);
//	float sf1 = obj.nextFloat();
//	float sf2 = obj.nextFloat();
//	float sf3 = sf1*sf2;
//	System.out.println("Multiplication of floating number: "+sf3);
//	}


    public static void main(String[] args)
   {

        System.out.println("Enter the two floating number");
        float sf1 = Float.parseFloat(args[0]);
        float sf2 = Float.parseFloat(args[1]);
        float sf3 = sf1 * sf2;
        System.out.println("Multiplication of floating number: " + sf3);
    }


}
