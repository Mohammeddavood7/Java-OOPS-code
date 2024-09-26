package Com.feb21.labtask;

//interface Course
//{
//	String courseName();
//	String facultyName();
//	String duration();
//}
//@FunctionalInterface
//interface NIT extends Course
//{
//	String nit(String courseName);
//}
//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) {
//		NIT nit = (String course) -> course;
//		System.out.println(nit.nit("Java"));
//	}
//}





//@FunctionalInterface
//interface NIT 
//{
//	String nit(String courseName);
//}
//interface Course extends NIT
//{
//	String courseName();
//	String facultyName();
//	String duration();
//}
//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) {
//		NIT nit = (String course) -> course;
//		System.out.println(nit.nit("Java"));
//	}
//}


//public class FunctionalInterface {
//	public static void main(String[] args) {
//		Object str = (String s) -> s.compareTo("goolge");
//		System.out.println(str);
//	}
//}


//@FunctionalInterface 
//interface Str
//{
//	String str(String str);
//}
//
//public class FunctionalInterface1 {
//	public static void main(String[] args) {
//		Str nit = s -> "Naresh"+s;
//		System.out.println(nit.str("IT"));	
//		
//		
//		String st = CompareTo();
//	}
//}//Naresh IT



//interface NIT
//{
//	public void nit();
//}
//
//public class FunctionalInterface1 
//{
//	public static void main(String[] args) {
////		String str = "IT";
////		NIT n = () -> 
////		{
////			System.out.println("Naresh" +str);
////		};
////		str.compareTo(str);
//		System.out.println("gooGleee".compareTo("googleee"));
//	}
//}




//public class Java8
//{
//	public static void main(String[] args) 
//	{
//		() -> System.out.println("NareshIT");
//	}
//}

//interface NIT
//{
//	public void myInterface(int a);
//}
//
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (a) -> a+1;
//	}
//}


//public class FunctionalInterface {
//	public static void main(String args[])
//	{
//		Function<Integer, Double> div = a -> a / 2.0;
//		System.out.println(div.apply(15));
//	}
//}



//class Student
//{ 
//    private int id;
//    private String name;
//    private String gender;
//    private int age;
// 
//    public Student(int id, String name, String gender, int age) 
//	{
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        }
// 
//    @Override
//    public String toString() 
//		{
//        return "[id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
//        }
//}
//		
//public class FunctionalInterface 
//{
//	public static void main(String[] args) 
//	{
//      Supplier<Student> stdSupplier = () -> new Student(1, "Virat", "Male", 24);
//		
//        Student std =  stdSupplier.get();
//        System.out.println(std);       
//	}
//}






//interface NIT
//{
//	public int myInterface(int a);
//}
//
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (a) -> a+1;
//	}
//}//nothing printed


//@FunctionalInterface
//interface NIT
//{
//	void nit(String name);
//}
//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) {
//		NIT nit = (String name) -> "";
//		System.out.println(nit.nit("NARESHIT"));
//		
//	}
//}//compiler error


//@FunctionalInterface
//interface NIT
//{
//	String nit(String name);
//}
//public class FunctionalInterfaceExample implements NIT
//{
//	public static void main(String[] args) {
//		FunctionalInterfaceExample nit = new FunctionalInterfaceExample();
//		System.out.println(nit.nit("Welcome to "));
//	}	
//	@Override
//	public String nit(String name) {
//		return name+"NARESHIT";
//	}
//}

//@FunctionalInterface
//interface NIT
//{
//	String nit(String name);
//}
//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) {
//		NIT nit = (String name) -> {
//			return name;
//		};
//		
//		NIT nit1 = (String name) -> name;
//		
//		System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
//	}
//}







//interface NIT
//{
//	String nit(String name);
//}
//public class FunctionalInterface
//{
//	public static void main(String[] args) {
//		NIT nit = (String name) -> "Welcome to " + name;
//		System.out.println(nit.nit("NARESHIT"));		
//	}
//}

//@FunctionalInterface
//interface NIT
//{
//	String nit(String name);
//}
//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) {
//		NIT nit = (String name) -> "Welcome to ";
//		System.out.println(nit.nit("NARESHIT"));		
//	}
//} //Welcome to
//



//@FunctionalInterface
//interface NIT
//{
//	void nit(String name);
//}
//public class FunctionalInterfaceExample
//{
//	public static void main(String[] args) {
//		NIT nit = (String name) -> "";
//		System.out.println(nit.nit("NARESHIT"));
//		
//	}
//}//compiler error
//



//interface NIT
//{
//	public int myInterface(int a);
//}
//
//public class Java8 {
//	public static void main(String[] args) {
//		NIT nit = (a) -> a+1;
//	}
//}



















































