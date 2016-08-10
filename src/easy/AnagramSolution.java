package easy;

import java.util.Arrays;

public class AnagramSolution {
	public boolean isAnagram(String s, String t) {
		if(s == null || t== null||s.length() != t.length()){
			return false;
		}
		
		int [] ms = new int[27];
		int [] mt = new int[27];
		
		for (int i = 0; i < s.length(); i++) {
			ms[s.charAt(i)-96]++;
			mt[t.charAt(i)-96]++;
		}
		
		for (int i = 1; i < 26; i++) {
			if(ms[i] != mt[i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean isAnagramSorting(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
	}
}
