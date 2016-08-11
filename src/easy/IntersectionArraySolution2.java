package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArraySolution2 {

	public int[] intersection(int[] nums1, int[] nums2) {

		int num1_length = nums1.length;
		int num2_length = nums2.length;

		if (0 == num1_length) {
			return nums1;
		}

		if (0 == num2_length) {
			return nums2;
		}

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i=0,j = 0;i<num1_length && j <num2_length; ){
			if(nums1[i] == nums2[j]){
				res.add(nums1[i]);
				i++;j++;
			}else if(nums1[i] < nums2[j]){
				i++;
			}else {
				j++;
			}
		}

		int[] res_int = new int[res.size()];

		int i = 0;
		for (Integer ele : res) {
			res_int[i++] = ele.intValue();
		}

		return res_int;
	}

}