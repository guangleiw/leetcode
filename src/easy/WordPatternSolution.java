package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class WordPatternSolution {
	public boolean wordPattern(String pattern, String str) {
		if (pattern == null && str == null)
			return false;

		int len_pat = pattern.length();
		String[] vals = str.split(" ");
		int len_vals = vals.length;

		if (len_pat != len_vals)
			return false;

		HashMap<Character, List<Integer>> hash_pat = new LinkedHashMap <Character, List<Integer>>();
		HashMap<String, List<Integer>> hash_str = new LinkedHashMap <String, List<Integer>>();
		
		for (int i = 0; i < len_pat; i++) {
			Character c = pattern.charAt(i);
//			List ls = new ArrayList<Integer>();
			if(hash_pat.containsKey(c)){
				hash_pat.get(c).add(i);
			}else{
				List ls = new ArrayList<Integer>(i);
				hash_pat.put(c, ls);
			}
		}
		
		for (int i = 0; i < len_vals; i++) {
			String s = vals[i];
//			List ls = new ArrayList<Integer>();
			if(hash_str.containsKey(s)){
				hash_str.get(s).add(i);
			}else{
				List ls = new ArrayList<Integer>(i);
				hash_str.put(s, ls);
			}
		}
		for (int i = 0; i < len_pat; i++) {
			for (int j = 0; j < vals.length; j++) {
				
			}
		}
		return false;
	}
}
