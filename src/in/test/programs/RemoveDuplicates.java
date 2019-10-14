package in.test.programs;

public class RemoveDuplicates {

	/*
	 * 26. Remove Duplicates from Sorted Array
	 * 
	 * 
	 * Given a sorted array nums, remove the duplicates in-place such that each
	 * element appear only once and return the new length.
	 * 
	 * Do not allocate extra space for another array, you must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
	 * Example 1:
	 * 
	 * Given nums = [1,1,2],
	 * 
	 * Your function should return length = 2, with the first two elements of nums
	 * being 1 and 2 respectively.
	 * 
	 * It doesn't matter what you leave beyond the returned length.
	 * 
	 */
	public static int removeDuplicates(int[] nums) {

		int l = 0;
		for (int i = 0; i < nums.length; i++) {

			if (i == nums.length - 1) {
				l++;
			} else if (nums[i] != nums[i + 1]) {
				l++;
			}
		}

		System.out.println(l);
		return l;
	}

}
