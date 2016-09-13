package easy;

import java.util.Stack;

import utils.ListNode;

public class PalindromLinkedListSolution {
	public boolean isPalindrome(ListNode head) {
		while (head == null || head.next == null)
			return true;
		ListNode p = head;
		ListNode b = head;

		int length = 0;
		while (p != null) {
			p = p.next;
			length++;
		}

		int pos = 0;
		Stack<Integer> stack = new Stack<Integer>();
		while (pos <= length / 2 - 1) {
			stack.push(b.val);
			if (pos != length / 2 - 1)
				b = b.next;
			pos++;
		}
		p = (length % 2 == 0) ? (b.next) : (b.next.next);
		while (!stack.isEmpty() && p != null) {
			int val = stack.pop();
			if (val != p.val)
				return false;
			p = p.next;
		}
		return true;
	}
}
