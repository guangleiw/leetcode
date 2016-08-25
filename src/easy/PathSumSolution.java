package easy;

import utils.TreeNode;

public class PathSumSolution {
	public boolean hasPathSum(TreeNode root, int sum) {
		while (root == null)
			return false;

		if (root.left == null && root.right == null && root.val == sum) {
			return true;
		}

		return (hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
	}
}
