package has_a_relation;

public class Sample
{
	  int a;
	  int b;
	public Sample(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Sample [a=" + a + ", b=" + b + "]";
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	  
	  
	}




