package easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArraySolution {

	public int[] intersection(int[] nums1, int[] nums2) {

		int num1_length = nums1.length;
		int num2_length = nums2.length;

		if (0 == num1_length) {
			return nums1;
		}
		
		if (0 == num2_length) {
			return nums2;
		}

		boolean[] map = new boolean[65536];
		for (int i = 0; i < nums1.length; i++) {
			map[nums1[i]] = true;
		}

		Set<Integer> res = new HashSet<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (map[nums2[i]]) {
				res.add(nums2[i]);
			}
		}

		int[] res_int = new int[res.size()];

		int i = 0;
		for (Integer ele:res) {
			res_int[i++] = ele.intValue();
		}

		return res_int;
	}
}