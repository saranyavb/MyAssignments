package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		System.out.println(" The missing element is ");
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (arr[i] != j) {
				System.out.println(j);
				break;

			}

		}

	}
}
