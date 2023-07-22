package week1.day1;

public class Fibbinocci {

public static void main(String[] args) {
	int num1=0,num2=1,sum=0;
	
	System.out.print(num1+" "+num2);//printing 0 and 1    
	for(int i=2;i<11;i++)//loop starts from 2 because 0 and 1 are already printed    
	{
		sum =num1+num2;
	
	System.out.print(" "+sum);
	num1=num2;
	num2=sum;

}}


	}


