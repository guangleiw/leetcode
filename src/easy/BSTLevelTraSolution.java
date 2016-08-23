package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utils.TreeNode;

public class BSTLevelTraSolution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (null == root)
			return res;

		TreeNode p = root;

		List<Integer> tmp = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Queue<TreeNode> sons = new LinkedList<TreeNode>();

		queue.add(p);
		sons.add(p);

		while (!sons.isEmpty()) {
			sons.clear();
			while (!queue.isEmpty()) {
				p = queue.poll();
				
				if (p.left != null)
					sons.add(p.left);
				if (p.right != null)
					sons.add(p.right);

				tmp.add(p.val);
			}
			res.add(new ArrayList<Integer>(tmp));
			tmp.clear();
			queue = new LinkedList<TreeNode>(sons);
		}
		return res;
	}
}
