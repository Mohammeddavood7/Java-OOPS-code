package Com.feb144.test;

abstract  class Socil 
{
	 String sender;
	 String content;
	
	
	
	
	public Socil(String sender, String content) {
		super();
		this.sender = sender;
		this.content = content;
	}
	public abstract void encrypt();
	public abstract void decrypt();
	 
	public abstract String displaySenderInfo();
	
	public String displayMessageInfo()
	{
		return " displaying general message information";
	}

}

class WhatsAppMessage extends Socil
{

	public WhatsAppMessage(String sender, String content) {
		super(sender, content);
		
	}

	@Override
	public void encrypt() {
		System.out.println("WhatsAppMessage encrypt");		
	}

	@Override
	public void decrypt() {
		System.out.println("WhatsAppMessage decrypt");		
		
	}

	@Override
	public String displaySenderInfo() {
		
		return "sender: "+sender+"content: "+ content;
	}
	
	
	
	public String displayMessageInfo()
	{
		return " WhatsAppMessage general message information";
	}
}




 class FacebookMessage extends Socil
 {
	 String imageAttachment ;
	 
        
	public FacebookMessage(String sender, String content, String imageAttachment) {
		super(sender, content);
		this.imageAttachment = imageAttachment;
	}

	@Override
	public void encrypt() {
		System.out.println("facebook encrypt");
		
	}

	@Override
	public void decrypt() {
		System.out.println("facebook decrypt");
		
	}

	@Override
	public String displaySenderInfo() {
		
		return "sender: "+sender+"content: "+ content+ "facebook attachment :"+imageAttachment;
	}
	
	
	public String displayMessageInfo()
	{
		return " FacebookMessage general message information";
	}
	
	 
 }
	
	
	
	
 public class Testing 
 {
	 public static void main(String[] args)
	 {
		 Socil s;
		 s = new WhatsAppMessage("suraj", "hi hello");
		String displayMessageInfo = s.displayMessageInfo();
		System.out.println(displayMessageInfo);
		String displaySenderInfo = s.displaySenderInfo(); 
		System.out.println(displaySenderInfo);
		
		s = new FacebookMessage("manas", "hi", "phone");
		String displayMessageInfo2 = s.displayMessageInfo();
	   System.out.println(displayMessageInfo2);
		String displaySenderInfo2 = s.displaySenderInfo(); 
		System.out.println(displaySenderInfo2);

	 }
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 