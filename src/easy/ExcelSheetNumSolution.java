package easy;

import java.lang.Math;

public class ExcelSheetNumSolution {
	public int titleToNumber(String s) {
		int res = 0;
		if (s.length() == 0)
			return res;

		// A Asci 码是65
		for (int i = s.length() - 1; i >= 0; i--) {
			res = (int) (res + (s.charAt(i) - 64) * Math.pow(26, s.length() - 1 - i));
		}

		return res;
	}
}
