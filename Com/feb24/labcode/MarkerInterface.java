package Com.feb24.labcode;

//class Employee implements Cloneable
//{
//	 int empId;
//	 String empName;
//	public Employee(int empId, String empName) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + "]";
//	}
//	
//	
//	   
//	      @Override
//          public Object clone() throws CloneNotSupportedException
//          {
//        	   return super.clone();
//          }          
//           
//
//}
//
//
//public class MarkerInterface
//{
//   public static void main(String[] args) throws CloneNotSupportedException
//   {
//	   Employee e1 = new Employee(111, "Warner");
//	  
//	  System.out.println( );
//	  
//	  Object clone = e1.clone();
//	
//   }
//}







class Employee implements Cloneable {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void duplicateObject() throws CloneNotSupportedException
    {
    	
        
    	Employee emp = (Employee) this.clone();
        emp.empId = 222;
        emp.empName = "Smith";
         
        System.out.println(emp.getEmpId() + " : " + emp.getEmpName()+" : ");
    }
}

public class MarkerInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(111, "Warner");
        e1.duplicateObject();
    }
}














































