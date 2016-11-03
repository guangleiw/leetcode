package easy;

public class ValidPalindromeSolution {
	public boolean isPalindrome(String s) {
		if (null == s || s.length() == 1)
			return true;
		int size = s.length();
		int i = 0, j = size - 1;
		while (i <= j) {
			boolean isNum = false;
			boolean isAlphabet = false;
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				isAlphabet = true;
			} else if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				isNum = true;
			} else {
				i++;
				continue;
			}

			if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')) {
				if (!isAlphabet)
					return false;
			} else if ((s.charAt(j) >= '0' && s.charAt(j) <= '9')) {
				if (!isNum)
					return false;
			} else {
				j--;
				continue;
			}

			if (s.charAt(i) == s.charAt(j) || (s.charAt(i) - 'A') == (s.charAt(j) - 'a')
					|| (s.charAt(i) - 'a') == (s.charAt(j) - 'A')) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

}
