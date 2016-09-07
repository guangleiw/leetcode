package easy;

public class CountSaySolution {
	public String countAndSay(int n) {
		String s = new String("1");
		if (n <= 0)
			return null;
		if(1== n) return s;
		String preStr = s;
		StringBuffer newStrBuf = new StringBuffer("");
		for (int c = 1; c < n; c++) {
			int count = 1;
			newStrBuf = new StringBuffer("");
			for (int i = 0, j = 1; j < preStr.length(); j++) {
				if (preStr.charAt(i) == preStr.charAt(j)) {
					count++;
				} else {
					newStrBuf.append(count);
					newStrBuf.append(preStr.charAt(i));
					i = j;
					count = 1;
				}
			}
			newStrBuf.append(count);
			newStrBuf.append(preStr.charAt(preStr.length()-1));
			preStr = newStrBuf.toString();
		}
		return newStrBuf.toString();
	}
}
