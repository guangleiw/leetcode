package easy;

import java.util.Arrays;

import utils.ListNode;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- 字符串反转 ---");
		ReverseStrSolution rs = new ReverseStrSolution();
		System.out.println(rs.reverseString(new String("This is a good example for reseving String in JAVA")));
		System.out.println(
				rs.reverseStringWithStringBuilder((new String("This is a good example for reseving String in JAVA"))));

		System.out.println("--- 整数求和 ---");
		SumIntegerSolution si = new SumIntegerSolution();
		System.out.println(si.getSum(10, 2));

		System.out.println("--- Array重叠  ---");
		IntersectionArraySolution ias = new IntersectionArraySolution();

		System.out.println("--- Array重叠  2 ---");
		IntersectionArraySolution2 ias2 = new IntersectionArraySolution2();
		printArray(ias2.intersection(new int[] { 1, 2, 2, 1, 3 }, new int[] { 2, 1, 2, 2, 1, 1, 1, 2 }));

		System.out.println("--- Excel Sheet Num ---");
		ExcelSheetNumSolution esns = new ExcelSheetNumSolution();
		System.out.println(esns.titleToNumber("AA"));

		System.out.println("--- Anagram String ---");
		AnagramSolution as = new AnagramSolution();
		System.out.println(as.isAnagram("abc", "abc"));
		System.out.println(as.isAnagram("a", "ab"));

		System.out.println("--- Roman to Integer ---");
		RomanToInteger rti = new RomanToInteger();
		System.out.println(rti.romanToInt("3999"));

		System.out.println("--- Reverse LinkList ---");
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		head.next = node;
		ReverseLinkedListSolution rlls = new ReverseLinkedListSolution();
		ListNode res = rlls.reverseList(head);
		printLinkList(res);

		System.out.println("--- is power of 2 ---");
		PowerOfTwoSolution pts = new PowerOfTwoSolution();
		System.out.println(pts.isPowerOfTwo1(6));
		;
		System.out.println(pts.isPowerOfTwo1(4));
		System.out.println(pts.isPowerOfTwo1(1));
		System.out.println(pts.isPowerOfTwo1(2));

		System.out.println("--- RansomNote ---");
		RansomNoteSolution rns = new RansomNoteSolution();
		System.out.println(rns.canConstruct("aa", "aab"));
		System.out.println(rns.canConstruct("", ""));

		System.out.println("--- happy number---");
		HappyNumSolution hns = new HappyNumSolution();
		System.out.println(hns.isHappy(7));
		;

	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void printLinkList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
			// break;
		}
	}

}
