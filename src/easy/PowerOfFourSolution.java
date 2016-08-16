package easy;

//1 => 1
//10 => 2
//100 => 4
//1000 => 8
//10000 => 16
//100000 => 32
//1000000 => 64
//10000000 => 128
//100000000 => 256
//1000000000 => 512
//10000000000 => 1024
//100000000000 => 2048
//1000000000000 => 4096
//10000000000000 => 8192
//100000000000000 => 16384

public class PowerOfFourSolution {
	public boolean isPowerOfFour(int num) {
		return num > 0 && (num & (num - 1)) ==0  && (num & 0x55555555) !=0;
	}

	// 换底公式来计算 类似于求3的power
	public boolean isPowerOfFour2(int num) {
		 return num > 0 && (Math.log10(num) / Math.log10(4)) - Math.log10(num) / Math.log10(4) == 0;
	}
	
}
