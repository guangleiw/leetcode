package easy;

public class FirstBadVersionSolution {
	public int firstBadVersion(int n) {

		int head = 1;
		int tail = n;
		int mid ;
		while (head < tail) {
			mid = head + (tail - head) / 2; //注意head+tail 会溢出
			if (isBadVersion(mid)) {

				tail = mid;

			} else {
				head = mid + 1;
			}
		}
		return head;

	}
}
