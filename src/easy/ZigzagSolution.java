package easy;

public class ZigzagSolution {
	public String convert(String s, int numRows) {

		if(numRows == 1) return s;
		
		int delta = 2 * numRows - 2;
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < numRows; i++) {
			int n = 0;
			StringBuilder sb = new StringBuilder("");
			if (0 == i || numRows - 1 == i) {
				while (i + n * delta <= s.length() - 1) {
					char c = s.charAt(i + n * delta);
					sb = sb.append(c);
					n++;
				}
			} else {
				while (i + n * delta <= s.length() - 1) {
					char c1 = s.charAt(i + n * delta);
					sb.append(c1);
					if (i + n * delta + (delta - 2 * i) <= s.length() - 1) {
						char c2 = s.charAt(i + n * delta + (delta - 2 * i));
						sb.append(c2);
					}
					n++;
				}
			}
			result = result.append(sb);
		}

		return result.toString();
	}
}
