package easy;

import java.util.HashMap;

public class ContainsDuplicateSolution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums == null || nums.length <= 1)
			return false;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int idx = 0;
		while (idx <= nums.length - 1) {
			int key = nums[idx];
			if(map.containsKey(key)){
				if(idx - map.get(key) <= k)
					return true;
				else{
					map.replace(key, idx);
				}
			}else{
				map.put(key,idx);
			}
			idx++;
		}
		
		return false;
	}
}
