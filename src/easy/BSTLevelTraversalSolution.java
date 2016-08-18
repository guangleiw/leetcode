package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import utils.TreeNode;

public class BSTLevelTraversalSolution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (root == null) {
			return result;
		}

		LinkedList<TreeNode> cur = new LinkedList<TreeNode>();
		LinkedList<TreeNode> next = new LinkedList<TreeNode>();
		cur.offer(root);

		ArrayList<Integer> valueList = new ArrayList<Integer>();

		// need to track when each level starts
		while (!cur.isEmpty()) {
			TreeNode head = cur.poll();

			valueList.add(head.val);

			if (head.left != null) {
				next.offer(head.left);
			}
			if (head.right != null) {
				next.offer(head.right);
			}

			if (cur.isEmpty()) {
				cur = next;
				next = new LinkedList<TreeNode>();
				result.add(valueList);
				valueList = new ArrayList<Integer>();
			}
		}

		// return Collections.reverse(result);
		List<List<Integer>> rvsd = new ArrayList<List<Integer>>();
		for (int i = result.size() - 1; i >= 0; i--) {
			rvsd.add(result.get(i));
		}

		return rvsd;
	}
}
