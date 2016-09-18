package easy;

public class AddBinarySolution {
	public String addBinary(String a, String b) {
		if (null == a || a.length() == 0)
			return b;
		if (null == b || b.length() == 0)
			return a;

		String lon = (a.length() > b.length()) ? a : b;
		String sho = (a.length() > b.length()) ? b : a;

		int sub = lon.length() - sho.length();

		StringBuilder sb = new StringBuilder(lon);
		int idx = lon.length() - 1;
		int carray = 0;
		int sum = 0;
		while (idx != 0) {
			sum = (lon.charAt(idx) - '0' + carray);
			if (idx - sub >= 0) {
				sum = (sum + sho.charAt(idx - sub) - '0');
				if (sum < 2) {
					sb.setCharAt(idx, (char) (sum + '0'));
					carray = 0;
				} else {
					sb.setCharAt(idx, (char) (sum - 2 + '0'));
					carray = 1;
				}
			} else {
				if (sum < 2) {
					sb.setCharAt(idx, (char) (sum + '0'));
					carray = 0;
				} else {
					sb.setCharAt(idx, (char) (sum - 2 + '0'));
					carray = 1;
				}
			}
			idx--;
		}

		if (lon.length() == sho.length()) {
			sum = (char) (carray + lon.charAt(idx) + sho.charAt(idx) - '0' - '0');
		} else {
			sum = (char) (carray + lon.charAt(idx) - '0');
		}

		if (1 == sum) {
			sb.setCharAt(idx, '1');
		} else if (2 == sum) {
			sb.setCharAt(idx, '0');
			sb = new StringBuilder("1").append(sb.toString());
		} else if(3 == sum){
			sb.setCharAt(idx, '1');
			sb = new StringBuilder("1").append(sb.toString());
		}
		return sb.toString();
	}
}
