package easy;

public class SingleNumberSolution {
	public int singleNumber(int[] nums) {
		if(nums.length == 1){
			return nums[0];
		}
		
		int rst = 0;;
		for (int i = 0; i < nums.length; i++) {
			rst = rst^nums[i];
		}
		return rst;
	}
}
