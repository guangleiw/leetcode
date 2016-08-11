package easy;

import java.util.Stack;
import utils.ListNode;

/**
 * 1. use stack. 
 * 2. change the values reverse.
 * 
 * @author wangguanglei1
 *
 */
public class ReverseLinkedListSolution {
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return head;

		ListNode pointer = head;
		Stack<ListNode> stack = new Stack<ListNode>();
		while (null != pointer) {
			stack.push(pointer);
			pointer = pointer.next;
		}

		ListNode res_head = stack.pop();
		pointer = res_head;
		while (!stack.isEmpty()) {
			ListNode temp = stack.pop();
			if(stack.isEmpty()){
				temp.next = null;
			}
			pointer.next = temp;
			pointer = pointer.next;
		}
		return res_head;
	}
}
