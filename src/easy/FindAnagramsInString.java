package easy;

import java.util.ArrayList;
import java.util.List;

public class FindAnagramsInString {
	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> res = new ArrayList<Integer>();

		if (null == s || null == p) {
			return res;
		}

		if (s.length() < p.length())
			return res;

		int pSize = p.length();

		int[] pMap = buildCharArray(p);
		int[] buffer = buildCharArray(s.substring(0, pSize));

		if (compareArray(buffer, pMap)) {
			res.add(0);
		}

		for (int idx = 1; idx <= s.length() - pSize; idx++) {
			buffer[s.charAt(idx - 1) - 'a']--;
			buffer[s.charAt(idx + pSize - 1) - 'a']++;
			if (compareArray(buffer, pMap)) {
				res.add(idx);
			}
		}
		return res;
	}

	public int[] buildCharArray(String s) {
		int[] ca = new int[26];
		for (int i = 0; i < s.length(); i++) {
			ca[s.charAt(i) - 'a']++;
		}
		return ca;
	}

	public boolean compareArray(int[] a1, int[] a2) {
		if (a1.length != a2.length)
			return false;

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i])
				return false;
		}
		return true;
	}
}
