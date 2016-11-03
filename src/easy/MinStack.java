package easy;

import java.util.Stack;

public class MinStack {
	/** initialize your data structure here. */

	private Stack<Integer> stack = null;
	private Stack<Integer> minStack = null;

	public MinStack() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	public void push(int x) {
		stack.push(x);

		if (minStack.isEmpty()) {
			minStack.push(x);
		} else if (minStack.peek() >= x) {
			minStack.push(x);
		}
	}

	public void pop() {
		if (stack.isEmpty() || stack.size() == 0)
			return;

		if (stack.peek() > minStack.peek()) {
			stack.pop();
		} else {
			stack.pop();
			minStack.pop();
		}
	}

	public int top() {
		if(stack.isEmpty()){
			return Integer.MIN_VALUE;
		}
		return stack.peek();
	}

	public int getMin() {
		if (!stack.isEmpty()) {
			return minStack.peek();
		}
		return Integer.MIN_VALUE;
	}
}
