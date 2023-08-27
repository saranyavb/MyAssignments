package week3.day1;

public class AxisBank extends BankInfo{
	
	public void  deposit()
	{
		System.out.println("25000");
	}


public static void main(String[] args) {
	AxisBank next= new AxisBank();
	next.saving();
	next.deposit();
}
}
