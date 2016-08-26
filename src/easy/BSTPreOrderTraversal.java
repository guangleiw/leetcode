package easy;

import java.util.Stack;

import utils.TreeNode;

/**
 * Steps for PreOrder traversal are: 1. Visit the node; 2. Traverse the left
 * subtree in preOrder; 3. Traverse the right subtree in preOrder;
 * 
 * Two ways of implementing it: Recursive or Iterative.s
 * 
 * @author wangguanglei1
 *
 */
public class BSTPreOrderTraversal {
	/**
	 * Recursive solution for traversing BST.
	 */
	public void preOrderRecursive(TreeNode root) {
		if (null != root) {
			System.out.println(root.val);
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
	}

	/**
	 * Iterative solution for traversing BST. For recursion , we use implicit
	 * stack. So here to convert recursive solution to iterative, we will use
	 * explicit stack. Steps: 1. Create empty stack and push root node into it.
	 * 2. Do the following loop when stack is not empty: Pop a node from stack
	 * and print it. Push right child of popped node to stack. Push left child
	 * of popped node to stack.
	 */
	public void preOrderIterative(TreeNode root) {
		if (null == root) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {
			TreeNode n = stack.pop();
			System.out.println(n.val);
			
			if(null != n.right){
				stack.push(n.right);
			}
			
			if(null != n.left){
				stack.push(n.left);
			}
		}
	}
}
