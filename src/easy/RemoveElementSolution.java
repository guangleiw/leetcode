package easy;

public class RemoveElementSolution {
	 public int removeElement(int[] nums, int val) {
		 if(0 == nums.length){
			 return 0;
		 }
		 
		 int i =0 , j = nums.length-1;
		 int res = nums.length;
		 while(i<=j){
			 if(nums[i] != val){
				 i++;
				 continue;
			 }
			 
			 if(nums[j] == val){
				 j--;
				 res--;
				 continue;
			 }
			 
			 nums[i] = nums[j];
			 res -- ;
			 i++;j--;
		 }
		 return res;
	 }
}
