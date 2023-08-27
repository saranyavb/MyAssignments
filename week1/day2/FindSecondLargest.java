package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int size = data.length;
		// arrange the numbers in ascending order
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int tmp = 0;
				if (data[i] > data[j]) {
					tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;

				}
			}
			System.out.println(data[i]);
		}

		// Pick the 2nd element from the last and print it
		int res = data[size - 2];
		System.out.println(res);
	}
}
