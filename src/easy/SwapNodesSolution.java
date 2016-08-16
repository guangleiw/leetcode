package easy;

import utils.ListNode;

public class SwapNodesSolution {
	public ListNode swapPairs(ListNode head) {
		if (null == head)
			return null;
		if (head.next == null)
			return head;

		ListNode temp = head.next;
		head.next = swapPairs(temp.next);
		temp.next = head;

		return temp;
	}
}
