package TryWithResources;

public class Addition implements Calculator
{
	
	private int n1;
	private int n2;
	
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Addition(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	@Override
	public String toString() {
		return "Addition [n1=" + n1 + ", n2=" + n2 + "]";
	}

	@Override
	public int calculat() 
	{
		return n1+n2;
		
		
	}

}






















































