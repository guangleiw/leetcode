package easy;

import utils.ListNode;

public class RmNthNodeFromListSolution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (null == head)
			return head;

		if (null == head.next) {
			if (1 == n)
				return null;
			else
				return head;
		}

		ListNode quick = head;
		ListNode slow = head;
		ListNode temp = head;
		int i = 1;
		while (i != n) {
			quick = quick.next;
			i++;
		}
		while (quick.next != null) {
			temp = slow;
			quick = quick.next;
			slow = slow.next;
		}

		if (slow == head) {
			head = head.next;
		} else {
			temp.next = slow.next;
		}
		return head;
	}
}
