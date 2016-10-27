package easy;

import java.util.Arrays;
import java.util.List;

import common.PrintTool;
import utils.ListNode;

public class Solution extends PrintTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrImplementation si = new StrImplementation();
		System.out.println(si.strStr("123456789", "12"));;
//		System.out.println(si.strStr("123456789", "89"));;
		System.out.println(si.strStr("89", "1289"));;
		System.out.println(si.strStr("", ""));;
//		si.strStr("abcdefghijklmn", "ab");
//		si.strStr("abcdefghijklmn", "ab");
//		si.strStr("abcdefghijklmn", "ab");
		
		
		/**
		 * ThirdMaxNum tmn = new ThirdMaxNum();
		 * 
		 * System.out.println(tmn.thirdMax(new int[] { 1, 2, 3 }));
		 * System.out.println(tmn.thirdMax(new int[] { 1, 2, 3, 4, 5 }));
		 * System.out.println(tmn.thirdMax(new int[] { 1, 2 }));
		 * System.out.println(tmn.thirdMax(new int[] { 1 }));
		 * System.out.println(tmn.thirdMax(new int[] { 2, 2, 3 }));
		 * System.out.println(tmn.thirdMax(new int[] { 1, 1, 1 }));
		 * System.out.println(tmn.thirdMax(new int[] { 1, 2, 1, 1 }));
		 * System.out.println(tmn.thirdMax(new int[] { -2147483648, 1, 1 }));
		 * System.out.println(tmn.thirdMax(new int[] { -2147483648, 2, 1 }));
		 * 
		 * 
		 * ListNode n1 = new ListNode(1); n1.next = new ListNode(2);
		 * n1.next.next = new ListNode(3); n1.next.next.next = new ListNode(4);
		 * 
		 * ListNode n2 = new ListNode(1); n2.next = new ListNode(1);
		 * n2.next.next = new ListNode(1); n2.next.next.next = new ListNode(1);
		 * 
		 * 
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
		 * 
		 * 
		 * CountSaySolution css = new CountSaySolution(); //
		 * System.out.println(css.countAndSay(2));
		 * System.out.println(css.countAndSay(5));
		 * 
		 * MergeSortedArraySolution msas = new MergeSortedArraySolution(); int[]
		 * a = new int[]{0}; int[] b = new int[]{1}; a = new int[]{1}; b = new
		 * int[]{}; msas.merge(a, 1, b, 0); printArray(a);
		 * 
		 * 
		 * ValidParenthessSolution vps = new ValidParenthessSolution();
		 * System.out.println(vps.isValid("([)]"));
		 * 
		 * 
		 * ContainsDuplicateSolution cds = new ContainsDuplicateSolution();
		 * System.out.println(cds.containsNearbyDuplicate(new int[]{1,2}, 2));
		 * 
		 * LengthLastWordSolution llws = new LengthLastWordSolution();
		 * System.out.println(llws.lengthOfLastWord(""));
		 * System.out.println(llws.lengthOfLastWord(" "));
		 * System.out.println(llws.lengthOfLastWord("string "));
		 * 
		 * PalindromLinkedListSolution pls = new PalindromLinkedListSolution();
		 * ListNode n1 = new ListNode(1); n1.next = new ListNode(2);
		 * n1.next.next = new ListNode(2); n1.next.next.next = new ListNode(1);
		 * System.out.println(pls.isPalindrome(n1));
		 * 
		 * 
		 * RemoveLinkedListElementsSolution rles = new
		 * RemoveLinkedListElementsSolution();
		 * System.out.println(rles.getClass().getClassLoader().toString());
		 * System.out.println(new Integer(1).getClass().getClassLoader());
		 * 
		 * ReverseBitsSolution rbs = new ReverseBitsSolution();
		 * System.out.println(rbs.reverseBits(43261596 ));
		 * System.out.println(rbs.reverseBits(65536));
		 * System.out.println(rbs.reverseBits(2));
		 * 
		 * System.out.println(Integer.toBinaryString(-1)); int a = 0xF000;
		 * System.out.println(a);
		 * 
		 * AddBinarySolution abs = new AddBinarySolution();
		 * System.out.println(abs.addBinary("0", "0"));
		 * System.out.println(abs.addBinary("1", "0"));
		 * System.out.println(abs.addBinary("1", "1"));
		 * System.out.println(abs.addBinary("1", "10"));
		 * System.out.println(abs.addBinary("0", "10"));
		 * System.out.println(abs.addBinary(
		 * "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
		 * "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
		 * ));
		 * 
		 * NthDigitSolution nds = new NthDigitSolution();
		 * System.out.println(nds.findNthDigit(150));
		 * System.out.println(nds.findNthDigit(11));
		 * 
		 * 
		 * TwoSumSolution tss = new TwoSumSolution(); printArray(tss.twoSum(new
		 * int[]{2,7,11,5}, 16));
		 * 
		 * IntegerReplaceSolution irs = new IntegerReplaceSolution();
		 * System.out.println(irs.integerReplacement(65535));
		 * System.out.println(irs.integerReplacement(1234));
		 * System.out.println(irs.integerReplacement(3)); System.out.println(
		 * "Replacements : "+irs.integerReplacement(10000)); System.out.println(
		 * "Replacements : "+irs.integerReplacement(39)); System.out.println(
		 * "Rep nums: "+irs.integerReplacement(1073741823)); System.out.println(
		 * "Rep nums: "+irs.integerReplacement(2147483647));
		 * 
		 * 
		 * FindAnagramsInString fais = new FindAnagramsInString(); List
		 * <Integer> res = fais.findAnagrams("cbaebabacd", "abc");
		 **/
	}
}
