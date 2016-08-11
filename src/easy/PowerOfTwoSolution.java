package easy;

public class PowerOfTwoSolution {
	public boolean isPowerOfTwo1(int n) {
		
		if(0 == n ) return false;
		
		if(1==n ) return true;
		
		while (n%2 ==0) {
			n = n / 2;
			if(n ==1) return true;
		}
		return false;
	}

	public boolean isPowerOfTwo2(int n) {
		return Integer.toString(n, 2).matches("10*");
	}
}
