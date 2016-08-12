package easy;

import java.util.Arrays;

public class RansomNoteSolution {
	public boolean canConstruct(String ransomNote, String magazine) {
		
		if(ransomNote.isEmpty()) return true;

		if (ransomNote.length() > magazine.length())
			return false;

		char ransom_arr[] = ransomNote.toCharArray();
		char magazine_arr[] = magazine.toCharArray();

		Arrays.sort(ransom_arr);
		Arrays.sort(magazine_arr);

		int i = 0, j = 0;
		for (i = 0, j = 0; i < ransom_arr.length && j < magazine_arr.length;) {
			if (ransom_arr[i] > magazine_arr[j]) {
				j++;
			} else if (ransom_arr[i] < magazine_arr[j]) {
				return false;
			} else {
				if (i == ransom_arr.length - 1) {
					return true;
				}
				i++;
				j++;

			}
		}
		return false;

	}
}
