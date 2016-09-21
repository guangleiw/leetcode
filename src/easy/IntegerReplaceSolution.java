package easy;

public class IntegerReplaceSolution {
	public int integerReplacement(int n) {
		if (1 == n)
			return 0;
		int sum = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
//				System.out.println(n);
				if (((n - 1) & (n - 2)) == 0) {
					n--;
				} else if (((n + 1) & n) == 0) {
					n++;
				} else {
					n--;
				}
			}
			System.out.println(n);
			sum++;
		}
		return sum;
	}
}
