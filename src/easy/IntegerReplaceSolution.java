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
				if(((n+1)&n) == 0){
					n++;
				}
				
				if(((n-1) &(n-2)) == 0){
					n--;
				}
			}
			sum++;
		}
		return sum;
	}
}
