package has_a_relation;

public class User 
{
Sample sample;//1000x
String name;
public User(Sample sample, String name) {
	super();
	this.sample = sample;
	this.name = name;
}
public Sample getSample() {
	return sample;
}
public void setSample(Sample sample) {
	this.sample = sample;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void m1()
{
System.out.println(sample.getA());
}

@Override
public String toString() {
	return "User [sample=" + sample + ", name=" + name + "]";
}
public static void main(String[] args) {
	Sample s=new Sample(5,60);// 1000x
	System.out.println(s);
	
	               
	User u1=new User(s, "abc");
	System.out.println(u1);
	User u2=new User(s, "zzz");
	System.out.println(u2);
	
	s.setA(10);
	System.out.println(u1);
	System.out.println(u2);
	 
	
	

	u1.setSample(new Sample(20, 60));
	System.out.println(u1);
	System.out.println(u2);
	
	u2.setSample(new Sample(30, 70));
	System.out.println(u2);
	System.out.println("..................................");
	System.out.println(u1.getSample());
	u1.setSample(new Sample(99,100));
	System.out.println(u1);
	
}


}