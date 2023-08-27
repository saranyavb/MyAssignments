package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Assignment1Task2 {

	public static void main(String[] args) {
		 //Psuedocode
		int[] data = {1,2,8,4,6,7,2,3,3,6,7};
		 // a) Remove the duplicates using Set, // b) Make sure the set is in the ascending order
		Set<Integer>uniq=new TreeSet <Integer>();
		for (int i=0;i<data.length;i++)
		{
		
		
			uniq.add(data[i]);
		}
			System.out.println("set is" +uniq);
			 // c) Iterate from the starting number and verify the next number is + 1
			for (int i = 1; i < uniq.size(); i++) {
				 //d) If did not match, that is the number
		        if (!uniq.contains(i)) {
		       System.out.println(i);    
		

		
		
	}
		 }
	}
	}
	


