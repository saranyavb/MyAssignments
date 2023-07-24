package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] numsa = { 3, 2, 11, 4, 6, 7 };
		int[] numsb = { 1, 2, 8, 4, 9, 7 };
		System.out.println("Intersection in given array");
		for (int i = 0; i < numsa.length; i++) {
			for (int j = 0; j < numsb.length; j++) {
				if (numsa[i] == numsb[j]) {
					System.out.println(numsb[j]);

				}
			}
		}
	}
}
