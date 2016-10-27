package common;

import java.util.Arrays;
import java.util.List;

import utils.ListNode;

public class PrintTool {
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void printLinkList(ListNode head) {
		int length = 0;
		while (head != null) {
			System.out.print(head.val + " ");
			length++;
			head = head.next;
		}

		System.out.println("//Length of the linked list :" + length);
	}

	public static <T> void out(List<T> args) {
		System.out.println("This is output of out :");
		for (int i = 0; i < args.size(); i++) {
			System.out.print(args.get(i) + " ");
		}
		System.out.println("");
	}
}
