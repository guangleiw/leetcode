package easy;

import utils.ListNode;

public class RemoveDuplicateEleSolution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode fast = head.next;
		ListNode slow = head;

		while (fast != null) {
			if (fast.val == slow.val) {
				slow.next = fast.next;
				fast = fast.next;;
			} else {
				fast = fast.next;
				slow = slow.next;
			}
		}
		return head;
	}
}
