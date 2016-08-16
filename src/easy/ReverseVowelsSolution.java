package easy;

public class ReverseVowelsSolution {
	String vowels = new String("aeiouAEIOU");

	public String reverseVowels(String s) {
		if (null == s || 0 == s.length()) {
			return s;
		}

		int head = 0;
		int tail = s.length() - 1;

		StringBuffer sb = new StringBuffer(s);
		while (head < tail) {
			if (vowels.indexOf(sb.charAt(head)) == -1) {
				head++;
				continue;
			}

			if (vowels.indexOf(sb.charAt(tail)) == -1) {
				tail--;
				continue;
			}
			char temp = sb.charAt(head);
			sb.setCharAt(head, sb.charAt(tail));
			sb.setCharAt(tail,temp);
			head++;tail--;
		}
		return sb.toString();
	}
}
