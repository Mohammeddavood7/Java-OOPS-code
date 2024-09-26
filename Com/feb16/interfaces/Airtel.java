package Com.feb16.interfaces;

public class Airtel implements SIMCardInterface {


	@Override
	public void phoneNumber() {
		System.out.println("Airtel Number: 98765433210");

	}

	@Override
	public void netWork() {
		System.out.println("Airtel Network");

	}

	@Override
	public void activation() {
		System.out.println("Airtel is active");

	}

	@Override
	public void deactivation() {
		System.out.println("Airtel is deactivation");

	}

}
