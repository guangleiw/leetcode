package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utils.TreeNode;

public class SymmetricBSTSolution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (true) {
			List<TreeNode> nodes = new ArrayList<TreeNode>();
			while (!queue.isEmpty()) {
				TreeNode node = queue.poll();
				nodes.add(node);
			}
			if (!isSymmetricNodes(nodes)) {
				// System.out.println("good");
				return false;
			}

			boolean end = true;
			for (TreeNode treeNode : nodes) {
				
				if(null == treeNode) continue;
				
				if (treeNode.left != null) {
					end = false;
				}
				queue.offer(treeNode.left);

				if (treeNode.right != null) {
					end = false;
				}
				queue.offer(treeNode.right);
			}
			if (end)
				break;
		}
		return true;
	}

	public boolean isSymmetricNodes(List<TreeNode> lst) {
		if (lst.size() == 0 || lst.size() == 1)
			return true;

		int j = lst.size() - 1;
		for (int i = 0; i <= j; i++, j--) {
			if (lst.get(i) == null && lst.get(j) == null) {
				continue;
			}

			if (lst.get(i) != null && lst.get(j) != null) {
				if (lst.get(i).val != lst.get(j).val) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	// public boolean isSymmetricNodes(List<TreeNode> lst) {
	// if (lst.size() == 0 || lst.size() == 1)
	// return true;
	//
	// int j = lst.size() - 1;
	// for (int i = 0; i <= j; i++) {
	// if (null == lst.get(i) && null == lst.get(j)) {
	// continue;
	// } else if (null != lst.get(i) && null != lst.get(j)) {
	// if (lst.get(i).val != lst.get(j).val) {
	// return false;
	// }
	// } else {
	// return false;
	// }
	// }
	// return true;
	// }

}
