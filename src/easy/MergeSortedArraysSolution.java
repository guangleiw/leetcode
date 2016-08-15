package easy;

import utils.ListNode;

public class MergeSortedArraysSolution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode l1_pointer = l1;
		ListNode l2_pointer = l2;

		ListNode res = new ListNode(-1);
		ListNode head = res;
		while (l1_pointer != null && l2_pointer != null) {
			ListNode node;
			if (l1_pointer.val <= l2_pointer.val) {
				node = new ListNode(l1_pointer.val);
				l1_pointer = l1_pointer.next;
			} else {
				node = new ListNode(l2_pointer.val);
				l2_pointer = l2_pointer.next;
			}
			res.next = node;
			res = res.next;
		}

		if (null != l1_pointer) {
			res.next = l1_pointer;
		} else if (null != l2_pointer) {
			res.next = l2_pointer;
		}
		return head.next;
	}
}
