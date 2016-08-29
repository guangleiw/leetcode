package easy;

import java.util.HashMap;

public class IsomorphicStringSolution {
	public boolean isIsomorphic(String s, String t) {
		if (s == null && t == null)
			return true;

		if (null == s || null == t)
			return false;
		
		HashMap<Character, Character> map = new HashMap<Character,Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			if(map.containsKey(cs)){
				if(map.get(cs) != ct){
					return false;
				}
			}else{
				if(map.containsValue(ct)){
					return false;
				}
				map.put(cs, ct);
			}
		}
		return true;
	}
}
