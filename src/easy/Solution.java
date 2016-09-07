package easy;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import utils.ListNode;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * System.out.println("--- 字符串反转 ---"); ReverseStrSolution rs = new
		 * ReverseStrSolution(); System.out.println(rs.reverseString(new String(
		 * "This is a good example for reseving String in JAVA")));
		 * System.out.println( rs.reverseStringWithStringBuilder((new String(
		 * "This is a good example for reseving String in JAVA"))));
		 * 
		 * System.out.println("--- 整数求和 ---"); SumIntegerSolution si = new
		 * SumIntegerSolution(); System.out.println(si.getSum(10, 2));
		 * 
		 * System.out.println("--- Array重叠  ---"); IntersectionArraySolution ias
		 * = new IntersectionArraySolution();
		 * 
		 * System.out.println("--- Array重叠  2 ---"); IntersectionArraySolution2
		 * ias2 = new IntersectionArraySolution2();
		 * printArray(ias2.intersection(new int[] { 1, 2, 2, 1, 3 }, new int[] {
		 * 2, 1, 2, 2, 1, 1, 1, 2 }));
		 * 
		 * System.out.println("--- Excel Sheet Num ---"); ExcelSheetNumSolution
		 * esns = new ExcelSheetNumSolution();
		 * System.out.println(esns.titleToNumber("AA"));
		 * 
		 * System.out.println("--- Anagram String ---"); AnagramSolution as =
		 * new AnagramSolution(); System.out.println(as.isAnagram("abc",
		 * "abc")); System.out.println(as.isAnagram("a", "ab"));
		 * 
		 * System.out.println("--- Roman to Integer ---"); RomanToInteger rti =
		 * new RomanToInteger(); System.out.println(rti.romanToInt("3999"));
		 * 
		 * System.out.println("--- Reverse LinkList ---"); ListNode head = new
		 * ListNode(1); ListNode node = new ListNode(2); head.next = node;
		 * ReverseLinkedListSolution rlls = new ReverseLinkedListSolution();
		 * ListNode res = rlls.reverseList(head); printLinkList(res);
		 * 
		 * System.out.println("--- is power of 2 ---"); PowerOfTwoSolution pts =
		 * new PowerOfTwoSolution(); System.out.println(pts.isPowerOfTwo1(6));
		 * 
		 * System.out.println(pts.isPowerOfTwo1(4));
		 * System.out.println(pts.isPowerOfTwo1(1));
		 * System.out.println(pts.isPowerOfTwo1(2));
		 * 
		 * System.out.println("--- RansomNote ---"); RansomNoteSolution rns =
		 * new RansomNoteSolution(); System.out.println(rns.canConstruct("aa",
		 * "aab")); System.out.println(rns.canConstruct("", ""));
		 * 
		 * System.out.println("--- happy number---"); HappyNumSolution hns = new
		 * HappyNumSolution(); System.out.println(hns.isHappy(7));
		 * 
		 * System.out.println("--- Remove duplicate elements ---");
		 * RemoveDuplicateEleSolution rdes = new RemoveDuplicateEleSolution();
		 * ListNode head2 = new ListNode(1); head2.next = new ListNode(3);
		 * head2.next.next = new ListNode(5); head2.next.next.next = new
		 * ListNode(10); printLinkList(rdes.deleteDuplicates(head2));
		 * 
		 * System.out.println("--- Climb Stairs ---"); ClimbStairsSolution css =
		 * new ClimbStairsSolution(); System.out.println(css.climbStairs2(45));
		 * 
		 * System.out.println("--- Best time to buy and sell stocks ---");
		 * BuySellStockSolution bsss = new BuySellStockSolution(); int[] prices1
		 * = new int[] { 7, 1, 5, 3, 6, 4 }; int[] prices2 = new int[] { 7, 6,
		 * 4, 3, 1 }; System.out.println(bsss.maxProfit(prices1));
		 * System.out.println(bsss.maxProfit(prices2));
		 * 
		 * System.out.println("--- Two Sorted Array merge ---");
		 * MergeSortedArraysSolution msas = new MergeSortedArraysSolution();
		 * ListNode head3 = new ListNode(-1); head3.next = new ListNode(2);
		 * head3.next.next = new ListNode(8); head3.next.next.next = new
		 * ListNode(9); printLinkList(msas.mergeTwoLists(head2, head3));
		 * 
		 * System.out.println("--- Reverse Vowels in String ---");
		 * ReverseVowelsSolution rvs = new ReverseVowelsSolution();
		 * System.out.println(rvs.reverseVowels("leetcode"));
		 * System.out.println(rvs.reverseVowels("aA"));
		 * System.out.println(rvs.reverseVowels("test"));
		 * 
		 * System.out.println("--- Swap Node Solution ---"); SwapNodesSolution
		 * sns = new SwapNodesSolution(); printLinkList(sns.swapPairs(head3));
		 * 
		 * System.out.println("--- House Robber Solution ---"); HouseRobSolution
		 * hrs = new HouseRobSolution(); System.out.println(hrs.rob(prices1));
		 * 
		 * 
		 * System.out.println("--- BST Level Traversal Solution ---");
		 * BSTLevelTraversalSolution bst_lts = new BSTLevelTraversalSolution();
		 * TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
		 * root.right = new TreeNode(3); List<List<Integer>> list =
		 * bst_lts.levelOrderBottom(root); //
		 * System.out.println(list.get(0).get(0));
		 * out(bst_lts.levelOrderBottom(root)); Queue<Integer> queue = new
		 * LinkedList<Integer>(); queue.offer(null);
		 * 
		 * System.out.println("--- Plus One Solution ---"); PlusOneSolution pos
		 * = new PlusOneSolution(); printArray(pos.plusOne(new int[]{9}));
		 * 
		 * System.out.println("--- Pascal Triangle Solution---"); PascalSolution
		 * ps = new PascalSolution(); List<Integer> src = new ArrayList
		 * <Integer>(); src.add(0, new Integer(1)); src.add(0, new Integer(2));
		 * src.add(0, new Integer(1)); out(ps.getNextList(src));
		 * 
		 * 
		 * System.out.println("--- MyQueue Solution ---"); MyQueueSolution mqs =
		 * new MyQueueSolution(); mqs.push(1); System.out.println(mqs.peek());
		 * 
		 * 
		 * System.out.println("--- Pascal Triangle  ---");
		 * PascalTriangle2Solution pts = new PascalTriangle2Solution(); List
		 * <Integer> ls = pts.getRow(8); out(ls);
		 * 
		 * System.out.println("--- Bulls Cows Solution---"); BullsCowsSolutions
		 * bcs = new BullsCowsSolutions();
		 * System.out.println(bcs.getHint("1807", "7810"));
		 * System.out.println(bcs.getHint("1123", "0111"));
		 * System.out.println(bcs.getHint("00112233445566778899",
		 * "16872590340158679432"));
		 * 
		 * 
		 * System.out.println("--- Rectangle Area Solution ---");
		 * RectangleAreaSolution ras = new RectangleAreaSolution();
		 * System.out.println(ras.computeArea(-2, -2, 2, 2, -1, -1, 1, 1));
		 * System.out.println(ras.computeArea(-2, -2, 2, 2, -2, 2, 2, 4));
		 * System.out.println(ras.computeArea(-5, -3, 0, 0, -3, -3, 3, 3));
		 * 
		 * 
		 * System.out.println("--- Implement Stack using Queue ---"); MyStack ms
		 * = new MyStack(); ms.push(1); ms.push(2); ms.pop();
		 * System.out.println(ms.top());
		 * 
		 * System.out.println("--- RmNthNodeFromListSolution ---");
		 * RmNthNodeFromListSolution rnfls = new RmNthNodeFromListSolution();
		 * ListNode n1 = new ListNode(1); n1.next = new ListNode(2);
		 * printLinkList(rnfls.removeNthFromEnd(n1, 2));
		 * 
		 * 
		 * System.out.println((new Date()).getTime());
		 * 
		 * SingleNumberSolution sns = new SingleNumberSolution(); int []arr =
		 * new int[]{1,2,3,2,1}; System.out.println(sns.singleNumber(arr));
		 * 
		 * 
		 * FindDiffSolution fds = new FindDiffSolution();
		 * System.out.println(fds.findTheDifference("abcd", "abcde"));;
		 * System.out.println(fds.findTheDifference("abcd", "eabcd"));;
		 * System.out.println(fds.findTheDifference("abcd", "abecd"));;
		 * 
		 * 
		 * WordPatternSolution wps = new WordPatternSolution();
		 * System.out.println(wps.wordPattern("abba", "dog cat cat dog"));
		 * System.out.println(wps.wordPattern("ab", "dog cat"));
		 * System.out.println(wps.wordPattern("aba", "dog cat cat"));
		 **/
		
		CountSaySolution css = new CountSaySolution();
//		System.out.println(css.countAndSay(2));
		System.out.println(css.countAndSay(5));

	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void printLinkList(ListNode head) {
		int length = 0;
		while (head != null) {
			System.out.print(head.val + " ");
			length++;
			head = head.next;
			// break;
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
