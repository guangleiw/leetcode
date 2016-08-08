package easy;
public class ReverseStrSolution {
    public String reverseString(String s) {   	
    	
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length()/2; i++) {
        	int swap_index = sb.length() - i -1;
        	if(sb.charAt(i) == sb.charAt(swap_index)){
        		continue;
        	}			
        	char temp = sb.charAt(i);
        	sb.setCharAt(i, sb.charAt(swap_index));
        	sb.setCharAt(swap_index, temp);
		}
        return sb.toString();
    }
}