package easy;

import utils.TreeNode;

public class MinimumDepthBSTSolution {
	public int minDepth(TreeNode root) {
		if (null == root)
			return 0;

		if (null == root.left && null == root.right)
			return 1;

		int minLeft = Integer.MAX_VALUE;
		int minRight = Integer.MAX_VALUE;
		
		if(root.left != null){
			minLeft = minDepth(root.left);
		}
		
		if(root.right != null){
			minRight = minDepth(root.right);
		}
		
		return Math.min(minLeft, minRight) + 1;
	}
}
