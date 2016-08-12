package easy;

public class ClimbStairsSolution {
	/**
	 * Waste much time
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {

		if (0 == n)
			return 0;

		if (1 == n)
			return 1;
		if (2 == n)
			return 2;

		int sum_n2 = climbStairs(n - 2);
		int sum_n1 = climbStairs(n - 1);

		return sum_n1 + sum_n2;
	}

	public int climbStairs2(int n) {

		if (0 == n)
			return 0;

		if (1 == n)
			return 1;
		if (2 == n)
			return 2;

		int[] set = new int[n + 1];
		set[0] = 0;
		set[1] = 1;
		set[2] = 2;

		for (int i = 3; i <= n; i++) {
			set[i] = set[i - 1] + set[i - 2];
		}

		return set[n];
	}
}
