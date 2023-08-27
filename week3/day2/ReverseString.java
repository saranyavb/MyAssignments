package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name= "Saranya";

//Convert the String to character array (use toCharArray)
//Use for loop to iterate through each character (from end to go to the first)
		for (int i=name.length()-1;i>=0;i--)
		{
			
			System.out.print(name.charAt(i));
		}
//Print the Characters continuously
//Hint  Use  system.out.print()
		
	}

}
