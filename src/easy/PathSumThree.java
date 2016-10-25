package easy;

import java.util.ArrayList;
import java.util.List;

import utils.TreeNode;

public class PathSumThree {
	public int pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		pathSum(root, sum, new ArrayList<Integer>(), res);
		return res.size();
	}

	void pathSum(TreeNode root, int sum, ArrayList<Integer> sol, List<List<Integer>> res) {
		if (null == root)
			return;

		sol.add(root.val);
		
		if (null == root.left && null == root.right && root.val == sum) {
			List<Integer> s = new ArrayList<Integer>(sol);
			res.add(s);
		} else {
			pathSum(root.left, sum - root.val, sol, res);
			pathSum(root.right, sum - root.val, sol, res);
		}
		sol.remove(sol.size() - 1);
	}
}
