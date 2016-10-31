package easy;

public class CountPrimesSolution {
	public int countPrimes(int n) {
		boolean[] nums = new boolean[n];
		this.initArray(nums, true);

		int lastPrime = 2;
		while (lastPrime * lastPrime <= n) {
			if (nums[lastPrime]) {

				for (int i = lastPrime; i * lastPrime < n; i++) {
					nums[i * lastPrime] = false;
				}
			}
			lastPrime++;
		}

		int cnt = 0;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i]) {
				cnt++;
			}
		}
		return cnt;

	}

	public void initArray(boolean[] arr, boolean d) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = d;
		}
	}
}
