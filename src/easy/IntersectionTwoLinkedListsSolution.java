package easy;

import utils.ListNode;

public class IntersectionTwoLinkedListsSolution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		int length_a = 0;
		int length_b = 0;
		
		ListNode pa = headA;
		ListNode pb = headB;
		
		while(pa.next != null){
			pa = pa.next;
			length_a++;
		}
		
		while(pb.next != null){
			pb = pb.next;
			length_b++;
		}
		
		if(pa.val != pb.val){
			return null;
		}
		
		int sub = length_a - length_b;
		
		pa = headA;
		pb = headB;
		
		if(sub>0){
			while(sub != 0){
				pa= pa.next;
				sub--;
			}			
		}else{
			while(sub != 0){
				pb= pb.next;
				sub++;
			}
		}
		
		while(pa!= null && pb != null  && pa.val != pb.val){
			pa = pa.next;
			pb = pb.next;
		}
		return pa;		
	}
}
