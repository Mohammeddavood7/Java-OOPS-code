package Com.march15.Exceptionss;

public class Test2 {
	public static int get() {
		int a = 5;
		while (a == 5) {
			try {
				System.out.println("Hellooo");
				return 10;
			} finally {
				continue;
			}
		}
		return 20;
	}
	public static void main(String[] args) {
		int i = get();
		System.out.println(i);
	}
}
