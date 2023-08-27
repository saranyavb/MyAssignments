package week1.day2;

import java.util.Arrays;

public class MInMax {

	public static void main(String[] args) {

		int[] score = { 98, 97, 87, 68, 87 };
		int length = score.length;
		// 68,87,87,97,98

		Arrays.sort(score);// arrange the numbers in ascending order
		for (int i = 0; i < length; i++) {
			System.out.println(score[i]);
		}
		System.out.println(score[0]);
		System.out.println(score[length - 1]);

	}
}