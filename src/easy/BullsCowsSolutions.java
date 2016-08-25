package easy;

public class BullsCowsSolutions {
	public String getHint(String secret, String guess) {
		int[] res = new int[10];
		for (int i = 0; i < secret.length(); i++) {
			res[secret.charAt(i) - '0']++;
		}

		int bull_sum = 0;
		int cow_sum = 0;

		for (int i = 0; i < guess.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				res[secret.charAt(i) - '0']--;
				bull_sum++;
			}
		}

		for (int i = 0; i < guess.length(); i++) {
			if (secret.charAt(i) != guess.charAt(i)) {
				if (res[guess.charAt(i) - '0'] > 0) {
					res[guess.charAt(i) - '0']--;
					cow_sum++;
				}
			}
		}
		String hint = new Integer(bull_sum).toString() + "A";
		hint = hint + new Integer(cow_sum).toString() + "B";

		return hint;
	}
}
