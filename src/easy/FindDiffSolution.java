package easy;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class FindDiffSolution {
	public char findTheDifference(String s, String t) {
		if(s.isEmpty() && !t.isEmpty()){
			return t.charAt(0);
		}
		
		char[] sa = s.toCharArray();
		char[] ta = t.toCharArray();
		
		Arrays.sort(sa);
		Arrays.sort(ta);
		
		int i =0;
		for (i = 0; i < sa.length; i++) {
			if(sa[i] != ta[i]){
				return ta[i];
			}
		}
		return ta[i];		
	}
}
