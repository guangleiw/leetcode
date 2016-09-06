package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class WordPatternSolution {
	public boolean wordPattern(String pattern, String str) {
		String[] strs = str.split(" ");

		if (pattern.length() != strs.length) {
			return false;
		}

		HashMap<Character, String> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if (map.get(pattern.charAt(i)).equals(strs[i])) {
					continue;
				} else {
					return false;
				}
			} else {
				if (map.containsValue(strs[i])) {
					return false;
				} else {
					map.put(pattern.charAt(i), strs[i]);
				}
			}
		}
		return true;
	}
}
