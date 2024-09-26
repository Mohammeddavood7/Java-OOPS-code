package jan_CopyLab;

public class MainOnA_And_B 
{
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B(a1);
		System.out.println(b1);
	}

}
