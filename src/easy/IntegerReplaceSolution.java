package easy;

public class IntegerReplaceSolution {
	public int integerReplacement(int n) {
		if (1 == n)
			return 0;
		if (n + 1 <= 0) {
			return 32;
		}
		int sum = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				sum++;
			} else {
				int np = n + 1;
				int ns = n - 1;
				sum++;
				int delta_p = 0;
				int delta_s = 0;

				while (np % 2 == 0) {
					delta_p++;
					np = np / 2;
				}

				while (ns % 2 == 0) {
					delta_s++;
					ns = ns / 2;
				}

				if (np < ns) {
					sum = sum + delta_p;
					n = np;
				} else {
					sum = sum + delta_s;
					n = ns;
				}
			}

		}
		return sum;
	}
}
