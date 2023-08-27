package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Assignment1Task3 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		// *Output= We learn java basics as part of sessions in week1
		 
		// * Psuedocode
		 
		// * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		
	String[] split = text.split(" ");
	for(int i=0;i<split.length;i++)
	{
		
	
		System.out.print(split[i]);
		Set<String> uniq =new TreeSet<String>();
		uniq.add(split[i]);
		System.out.println(uniq);
	
		// * c) Create a empty Set 
		// * d) Iterate the String array
	    //             d.1) add each word into Set
		// * e) Print the Set values which is having unique words
		;
	}
	}
}
