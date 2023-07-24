package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		
		System.out.println(" The missing element is ");
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length; i++) {
			if (arr.length == arr[i]) {
				System.out.println(arr[i]);
			}

		}

	}
}
