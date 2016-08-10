package easy;

import java.util.Arrays;

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

		System.out.println("--- Excel Sheet Num ---");
		ExcelSheetNumSolution esns = new ExcelSheetNumSolution();
		System.out.println(esns.titleToNumber("AA"));
		
		System.out.println("--- Anagram String ---");
		AnagramSolution as = new AnagramSolution();
		System.out.println(as.isAnagram("abc", "abc"));
		System.out.println(as.isAnagram("a", "ab"));
		
	}

}
