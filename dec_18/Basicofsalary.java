package dec_18;

public class Basicofsalary {
	public static void main(String[] args) {
		System.out.println();
		if(args.length<1)
		{
			System.out.println("Enter the salary");
			System.exit(1);
		}
		double salary = Double.parseDouble(args[0]);
		double hra = salary*15.00/100;
		double conve = salary*10.0/100;
		double en = salary*10.0/100;
		double total = salary+hra+conve+en;
		System.out.println("total salary of person: "+total);
		  
	}

}
