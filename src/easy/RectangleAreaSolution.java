package easy;

public class RectangleAreaSolution {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

		int sum = ((C - A) * (D - B)) + ((G - E) * (H - F));

		int common = 0;
		// Get Length of Rectangle
		int length = 0;
		if (E >= A && E <= C) {
			if (G > C) {
				length = C - E;
			} else {
				length = G - E;
			}
		} else if (E < A) {
			if (G > A && G < C) {
				length = G - A;
			} else if (G >= C) {
				length = C - A;
			}
		}

		int width = 0;
		if (H >= B && H <= D) {
			if (F > B) {
				width = H - F;
			} else {
				width = H - B;
			}
		} else if (H > D) {
			if (F > B && F < D) {
				width = D - F;
			} else if (F <= B) {
				width = D - B;
			}
		}
		common = length * width;
		return sum - common;
	}
}
