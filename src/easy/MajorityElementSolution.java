package easy;

import java.util.Arrays;

public class MajorityElementSolution {
	public int majorityElement(int[] nums) {
		if (null == nums || nums.length == 0)
			return -1;
		Arrays.sort(nums);
		int length = nums.length;
		return nums[length / 2];
	}
}
