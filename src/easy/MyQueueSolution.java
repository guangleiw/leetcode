package easy;

import java.util.Stack;

class MyQueueSolution {

	Stack<Integer> master = new Stack<Integer>();
	Stack<Integer> slave = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {

		if (master.isEmpty() && slave.isEmpty()) {
			master.push(new Integer(x));
			return;
		}
		if (!slave.isEmpty()) {
			swap(slave, master);
		}
		master.push(new Integer(x));
	}

	// Removes the element from in front of queue.
	public void pop() {
		if (master.isEmpty() && slave.isEmpty()) {
			return;
		}

		if (!master.isEmpty()) {
			swap(master, slave);
		}
		slave.pop();
	}

	// Get the front element.
	public int peek() {
		if (master.isEmpty() && slave.isEmpty()) {
			return -1;
		}

		if (!master.isEmpty()) {
			swap(master, slave);
		}

		return slave.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return (master.isEmpty() && slave.isEmpty());
	}

	private void swap(Stack<Integer> src, Stack<Integer> dst) {

		while (src != null && !src.isEmpty() && (null != dst)) {
			Integer obj = src.pop();
			dst.addElement(obj);
		}
	}
}