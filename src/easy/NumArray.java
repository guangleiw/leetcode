package easy;

public class NumArray {
	private int[] sumNums = null;

	public NumArray(int[] nums) {
		if (null == nums || nums.length == 0) {
			return;
		}
		this.sumNums = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum+nums[i];
			this.sumNums[i] = sum;
		}
	}

	public int sumRange(int i, int j) {
		return (0 == i) ? (this.sumNums[j]) : (this.sumNums[j] - this.sumNums[i - 1]);
	}
}
