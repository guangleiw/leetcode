package easy;

public class RomanToInteger {
	public int romanToInt(String s) {
		int length = s.length();
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = (int) (sum + Math.pow(10, i)*(s.charAt(length-i-1) - '0'));
		}
		return sum;
	}
}
