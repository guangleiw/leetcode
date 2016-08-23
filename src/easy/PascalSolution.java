package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalSolution {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (0 == numRows)
			return res;
		List<Integer> head = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		head.add(1);
		res.add(head);
		temp = head;
		for (int i = 1; i < numRows; i++) {
			temp = getNextList(temp);
			res.add(temp);
		}
		return res;
	}

	public List<Integer> getNextList(List<Integer> src) {
		int length = src.size();
		if (0 == length)
			return src;
		List<Integer> res = new ArrayList<Integer>();
		res.add(0, src.get(0));

		int index = 1;
		for (index = 1; index < length; index++) {
			res.add(index, src.get(index) + src.get(index - 1));
		}
		res.add(index, src.get(index - 1));
		return res;
	}

}
