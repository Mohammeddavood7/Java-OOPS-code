package Com.feb16.interfaces;

public class BSNL implements SIMCardInterface {

	@Override
	public void phoneNumber() {
		System.out.println("BSNL Number: 6789922345");

	}

	@Override
	public void netWork() {
		System.out.println("BSNL Network");

	}

	@Override
	public void activation() {
		System.out.println("BSNL is active");

	}

	@Override
	public void deactivation() {
		System.out.println("BSNL is deactivation");

	}
}
