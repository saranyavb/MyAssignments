package week1.day2;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] nums = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		System.out.println("Duplicate elements in given array");
		// get the length of the array
		int length = nums.length;
		int count;
		// iterate from i to the length of the array by adding 1 to it (inner loop
		// starts here)
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				count = 0;
				if (nums[i] == nums[j]) {
					// print the matching value
					System.out.println(nums[j]);
				}
			}
		}
	}
}
