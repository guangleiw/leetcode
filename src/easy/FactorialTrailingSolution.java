package easy;

public class FactorialTrailingSolution {
	public int trailingZeroes(int n) {
		int num =0;
		int index = 0;
		for (index = 5; index <= n;index = index +5){
			int k = index;
			while(k%5 == 0){
				num++;
				k = k/5;
			}
		}
		return num;
	}

	public int trailingZeroes2(int n) {
		int num = 0;
		while(n !=0){
			num += n/5;
			n = n/5;
		}
		return num;
	}
}
