package easy;

public class HouseRobSolution {
	public int rob(int[] nums) {
		int length = nums.length;
		if (length == 0)
			return 0;
		if (1 == length)
			return nums[0];
		int[] sum = new int[length];
		sum[0] = nums[0];
		sum[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < length; i++) {
			sum[i] = Math.max(sum[i - 2] + nums[i], sum[i - 1]);
		}
		return sum[length - 1];
	}

	public int rob2(int[] num) {
		if (num == null || num.length == 0)
			return 0;

		int even = 0;
		int odd = 0;

		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				even += num[i];
				even = even > odd ? even : odd;
			} else {
				odd += num[i];
				odd = even > odd ? even : odd;
			}
		}

		return even > odd ? even : odd;
	}
}
