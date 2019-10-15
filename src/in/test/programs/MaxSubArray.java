package in.test.programs;

public class MaxSubArray {

	public MaxSubArray() {
		// TODO Auto-generated constructor stub
	}

	public static int maxSubArray(int[] nums) {

		int max_ending_so_far = 0;
		int max_ending_here = 0;
		int smallest_value = 0;

		for (int i = 0; i < nums.length; i++) {

			max_ending_here += nums[i];

			if (max_ending_here < 0) {
				max_ending_here = 0;

			} else if (max_ending_so_far < max_ending_here) {
				max_ending_so_far = max_ending_here;
			}

			if (i == 0) {
				smallest_value = nums[i];
			} else if (smallest_value < nums[i])
				smallest_value = nums[i];
		}

		if (max_ending_so_far == 0) {
			System.out.println(smallest_value);
			return smallest_value;
		}

		System.out.println(max_ending_so_far);
		return max_ending_so_far;

	}

}
