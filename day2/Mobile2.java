package week1.day2;

public class Mobile2 {

	public static void main(String[] args) {
		Mobile alternate = new Mobile();
		alternate.sendSms();
		long makeCall = alternate.makeCall(9876547656l);
		System.out.println(makeCall);
	}
}
