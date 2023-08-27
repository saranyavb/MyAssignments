package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment1Task1 {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;
				// Pseudo Code: 
				 //a) Create a empty Set Using TreeSet
				 Set<Integer> value =new TreeSet <Integer>();
				 
				 //b) Declare for loop iterator from 0 to data.length and add into Set 
				 for(int i=0;i<data.length;i++)
				 {
					 value.add(data[i]);
					 }
					 System.out.println(value);
				 
				// c) converted Set into List
				 List<Integer>updated=new ArrayList<Integer>();
				 updated.addAll(value);
				 
				 //d) Print the second last element from List
				 Integer integer = updated.get(4);
				 System.out.println(integer);
	}

}
