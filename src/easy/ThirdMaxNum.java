package easy;

import common.PrintTool;

public class ThirdMaxNum extends PrintTool {
	public int thirdMax(int[] nums) {
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;

		boolean hasThirdMax = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > secondMax && nums[i] < max) {
				secondMax = nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= thirdMax && nums[i] < secondMax) {
				thirdMax = nums[i];
				hasThirdMax = true;
			}
		}
		return hasThirdMax ? thirdMax : max;

	}
}
