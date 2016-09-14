package easy;

public class ReverseBitsSolution {
	public int reverseBits(int n) {
		if (0 == n || 0xFFFFFFFF == n)
			return n;
		int a = ((n&0xAAAAAAAA) >>1)|((n&0x55555555) << 1);
		a = ((a&0xCCCCCCCC) >>2)|((a&0x33333333) << 2);
		 a = ((a&0xF0F0F0F0) >>4)|((a&0x0F0F0F0F) << 4);
		 a = ((a&0xFF00FF00) >>8)|((a&0x00FF00FF) << 8);
		 a = ((a&0xFFFF0000) >>16)|((a&0x0000FFFF) << 16);
		return a;
	}
}
