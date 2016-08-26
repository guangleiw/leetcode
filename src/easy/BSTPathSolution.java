package easy;

import java.util.ArrayList;
import java.util.List;

import utils.TreeNode;

public class BSTPathSolution {

	public List<String> res = new ArrayList<String>();

	public List<String> binaryTreePaths(TreeNode root) {
//		List<Integer> list = new ArrayList<Integer>();
		getOnePath(root, new ArrayList<Integer>());
		return this.res;
	}

	public void getOnePath(TreeNode root, ArrayList<Integer> path) {
		if (root == null) {
			return;
		}

		path.add(root.val);
		if (root.left == null && root.right == null) {
			this.res.add(formatString(path));
		}
		getOnePath(root.left, new ArrayList<>(path));
		getOnePath(root.right, new ArrayList<>(path));
	}

	public String formatString(ArrayList<Integer> list) {
		String res = new String(list.get(0).toString());
		for (int i = 1; i < list.size(); i++) {
			res = res + "->" + list.get(i).toString();
		}
		return res;
	}
}
