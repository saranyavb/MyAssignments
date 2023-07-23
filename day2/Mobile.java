package week1.day2;

public class Mobile {
	 public void sendSms()
	 {
		 System.out.println("From OPPO");
	 }
	 public long makeCall(long phno)
	 {
		 return phno;
	 }

	public static void main(String[] args) {
		Mobile get =new Mobile();
		get.sendSms();
		
		long phno=get.makeCall(8765456890l);
		System.out.println("My phone number is " +get.makeCall(8765456890l));
		

	}

}
