package easy;

public class ReverseBitsSolution {
	public int reverseBits(int n) {
		if (0 == n || 0xFFFFFFFF == n)
			return n;
		int b = 0;
		int nums = 32;
		while (nums != 0) {
			b = b << 1;
			b = b | (n & 0x01);
			n = n >> 1;
			nums--;
		}
		return b;
	}
}
