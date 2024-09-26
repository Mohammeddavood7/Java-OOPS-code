	package jan_CopyLab;
	
	public class Person
	{
	
	    
		private String personName;
		private String personPlace;
		private long personMobileNumber;
		private String personState;
		private PanCard pancard;
		
		
	
		public Person(PanCard pancard,String personName, String personPlace, long personMobileNumber, String personState) {
			super();
			this.pancard = pancard;
			this.personName = personName;
			this.personPlace = personPlace;
			this.personMobileNumber = personMobileNumber;
			this.personState = personState;
		}
	
		public String display()
		{
			return pancard.getPancardNumber();
		}
	
	
		@Override
		public String toString() {
			return "Person [pancard=" +display() + ", personName=" + personName + ", personPlace=" + personPlace
					+ ", personMobileNumber=" + personMobileNumber + ", personState=" + personState + "]";
		}
		
		
		
		
		
	
		
	}
