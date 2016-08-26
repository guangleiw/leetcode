package easy;

import java.util.LinkedList;
import java.util.Queue;

import utils.TreeNode;

/**
 * 
 * We will use Queue for Level Order traversal. Steps for Level Order Traversal
 * algorithm: 1. Create empty queue and push root node to it. 2. Do the
 * following when queue is not empty. Pop a node from queue and print it. Push
 * left child of popped node to queue if not null. Push right child of popped
 * node to queue if not null.
 * 
 * @author wangguanglei1
 *
 */
public class BSTLevelOrderTraversal {
	public static void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.println(node.val);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}

	}

}
