package easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoSumSolution {
	public int[] twoSum(int[] nums, int target) {
		if (null == nums)
			return nums;
		if (nums.length == 1 && nums[0] == target)
			return new int[] { 0 };

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int rst[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if(hash.containsKey(nums[i])){
				if(target - nums[i] == nums[i]){
					rst[0] = hash.get(nums[i]);
					rst[1] = i;
					return rst;
				}
			}
			hash.put(nums[i], i);
		}
		Iterator<Map.Entry<Integer, Integer>> entries = hash.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<Integer, Integer> entry = entries.next();
			if(hash.containsKey(target - entry.getKey())){
				rst[0] = entry.getValue();
				rst[1] = hash.get(target - entry.getKey());
			}
		}
		return rst;
		
	}
}
