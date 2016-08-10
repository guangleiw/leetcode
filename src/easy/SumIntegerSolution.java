package easy;

public class SumIntegerSolution {
	public int getSum(int a, int b) {
		if( 0 == b){
			return a;
		}
		
		while (b!=0){
			int carry = a&b;
			a = a^b;
			b = carry << 1;
		}
		return a;
	}
}
