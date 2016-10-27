package easy;

public class StrImplementation {
	public int strStr(String haystack, String needle) {
		if (haystack == null || null == needle){
			return -1;
		}
		
		 if(needle.isEmpty() && haystack.isEmpty()) {
			 return 0;
		 }

		if (haystack.length() < needle.length())
			return -1;

		int nSize = needle.length();
		for (int i = 0; i <= haystack.length() - nSize; i++) {
			String subStr = haystack.substring(i, nSize + i);
			if (needle.equals(subStr))
				return i;
		}
		return -1;
	}
}
