package Com.arrays.logicalsection;

public class SevenDay1
{
	private int id;
	private String name;
	private double fees;
	
	public SevenDay1(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFees() {
		return fees;
	}
	
     public static void main(String[] args) 
     {
    	 SevenDay1 s1 = new SevenDay1(111, "Scott", 120000);
    	 
    	 SevenDay1 s2 = new SevenDay1(222, "Smith", 200000);
    	 
    	 SevenDay1 s3 = new SevenDay1(333, "Sway", 300000);
    	 
    	 
    	 SevenDay1[] obj = {s1,s2,s3};
    	 
    	 
    		 for(int i=0;i<obj.length;i++)
    		 {
    		     System.out.println("output: "+(i+1)+"\n"+obj[i].id+"  "+obj[i].name+"  "+obj[i].fees+"\n");
    		 }
    
    	 
    	 
	
     }
	

}
