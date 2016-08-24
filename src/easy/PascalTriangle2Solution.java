package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2Solution {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		for (int i = 1; i <= rowIndex; i++) {

			int tmp1 = 1, tmp2 = 1;

			int idx = 1;
			int length = res.size();
			for (idx = 1; idx <= length - 1; idx++) {
				tmp1 = res.get(idx);
				res.set(idx, res.get(idx) + tmp2);
				tmp2 = tmp1;
			}
			res.add(1);
		}
		return res;
	}
}
