package week3.day1;

public class Samsung extends AndriodTv implements Android {
	public void playvideo()
	{
		System.out.println("watch my video");
		
	}
	public void openapp1()
	{
		System.out.println("open my app:samsung");
		
	}
	public static void main(String[] args) {
		Samsung now=new Samsung();
		now.openapp1();
		now.oppenapp();
		now.playvideo();
		now.oppenapp();
		
	}

	public void openapp() {
System.out.println("open the application");
		
	}

	

}