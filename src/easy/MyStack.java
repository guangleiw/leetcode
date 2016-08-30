package easy;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {

		if (q1.isEmpty() && q2.isEmpty()) {
			q1.offer(new Integer(x));
			return;
		}

		if (!q1.isEmpty()) {
			q1.offer(new Integer(x));
			return;
		}

		if (!q2.isEmpty()) {
			q2.offer(new Integer(x));
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (q1.isEmpty() && q2.isEmpty()) {
			return;
		}

		if (!q1.isEmpty()) {
			while (true) {
				int val = q1.poll();
				if (!q1.isEmpty()) {
					q2.offer(new Integer(val));
				} else {
					break;
				}
			}
			return ;
		}
		if (!q2.isEmpty()) {
			while (true) {
				int val = q2.poll();
				if (!q2.isEmpty()) {
					q1.offer(new Integer(val));
				} else {
					break;
				}
			}
		}
	}

	// Get the top element.
	public int top() {
		if (q1.isEmpty() && q2.isEmpty()) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int val = 0;

		if (!q1.isEmpty()) {
			while (true) {
				val = q1.poll();
				q2.offer(new Integer(val));
				if (q1.isEmpty())
					break;
			}
		}
		if (!q2.isEmpty()) {
			while (true) {
				val = q2.poll();
				q1.offer(new Integer(val));
				if (q2.isEmpty()) {
					break;
				}
			}
		}
		return val;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return (q1.isEmpty() && q2.isEmpty());
	}
}
