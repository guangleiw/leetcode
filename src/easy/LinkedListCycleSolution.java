package easy;

import utils.ListNode;

public class LinkedListCycleSolution {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;

		ListNode slow = head;
		ListNode fast = head.next.next;

		while (fast != null && fast.next != null) {
			if (fast.val == slow.val) {
				return true;
			} else {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return false;
	}
}
