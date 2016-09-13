package easy;

import utils.ListNode;

public class RemoveLinkedListElementsSolution {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return head;
		if (head.next == null) {
			if (head.val == val)
				return null;
			else {
				return head;
			}
		}

		ListNode f = head;
		ListNode s = head;
		while (f.val == val) {
			f = f.next;
			if (f == null)
				return null;
			s = f;
			head = s;
		}
		f = f.next;
		while (f != null) {
			if (f.val == val) {
				f = f.next;
				s.next = f;
			} else {
				f = f.next;
				s = s.next;
			}
		}
		return head;
	}
}
