package easy;

import java.util.HashSet;

public class HappyNumSolution {
	HashSet<Integer> set = new HashSet<Integer>();
	public boolean isHappy(int n) {	
//		System.out.println("n:"+n);
		if (1 == n)
			return true;

		int sum =0;
		while(n!=0){
			sum = sum+(n%10)*(n%10);
			n = n/10;
//			System.out.println(sum);
		}		
		if (set.contains(sum))
			return false;
		set.add(sum);
		return isHappy(sum);

	}
}
