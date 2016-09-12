package easy;

public class LengthLastWordSolution {
	public int lengthOfLastWord(String s) {
		if (null == s)
			return 0;

		String[] strs = s.split(" ");
		if (strs.length == 0)
			return 0;
		return strs[strs.length - 1].length();
	}
}
