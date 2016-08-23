package easy;

public class PlusOneSolution {
	public int[] plusOne(int[] digits) {
		int length = digits.length;
		for (int i = length - 1; i >= 0; i--) {
			int sum = digits[i] + 1;
			if (sum <= 9) {
				digits[i] = sum;
				return digits;
			} else {
				digits[i] = sum - 10;				
			}
		}
		int[] res = new int[length+1];
		res[0] = 1;
//		for (int i = 1; i < res.length; i++) {
//			res[i] = 0;
//		}
		return res;
	}
}
