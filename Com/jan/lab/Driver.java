package Com.jan.lab;

public class Driver
{
	private String name;
	private int age;
	
	public Driver(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
