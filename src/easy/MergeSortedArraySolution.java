package easy;

public class MergeSortedArraySolution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int idx_n = n - 1;
		int idx_m = m - 1;
		int fill_idx = m-1;
		while(idx_n >=0 && idx_m >=0){
			if(nums1[idx_m] >= nums2[idx_n]){
				nums1[fill_idx] = nums1[idx_m];
				idx_m--;
			}else{
				nums1[fill_idx] = nums2[idx_n];
				idx_n--;
			}
			fill_idx--;
		}
		while(idx_m>=0){
			nums1[fill_idx--] = nums1[idx_m--];
		}
		
		while(idx_n>=0){
			nums1[fill_idx--] = nums2[idx_n--];
		}
	}
}
