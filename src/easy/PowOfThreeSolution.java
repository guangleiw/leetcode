package easy;

import java.util.Arrays;
import java.util.HashSet;

public class PowOfThreeSolution {
	public boolean isPowerOfThree1(int n) {
		int maxPowerOfThree = (int) Math.pow(3, (int) (Math.log(0x7fffffff) / Math.log(3)));
		return n > 0 && maxPowerOfThree % n == 0;
	}

	public boolean isPowerOfThree2(int n) {
		HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147,
				531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467));
		return set.contains(n);
	}

	public boolean isPowerOfThree3(int n) {
		return Integer.toString(n, 3).matches("10*");
	}
}
