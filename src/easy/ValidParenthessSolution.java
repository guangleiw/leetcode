package easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthessSolution {
	public boolean isValid(String s) {
		if (null == s)
			return true;
		if (s.length() % 2 != 0) {
			return false;
		}

		HashMap<Character, Character> hash = new HashMap<>();
		hash.put('(', ')');
		hash.put('{', '}');
		hash.put('[', ']');
		hash.put(')', '(');
		hash.put('}', '{');
		hash.put(']', '[');

		Stack<Character> stack = new Stack<>();
		int idx = 0;
		while (idx <= s.length()-1) {
			char c = s.charAt(idx++);
			if (stack.isEmpty()) {
				stack.push(c);
			} else {
				if (hash.get(stack.peek()) == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
		return (stack.isEmpty())?true:false;

	}
}
