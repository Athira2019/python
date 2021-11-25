import java.util.Arrays;

//Book pg 265
public class TripleStep {
	public int countways(int n) {
		if (n < -1)
			return 0;
		if (n == 0) {
			return 1;
		} else
			return countways(n - 1) + countways(n - 2) + countways(n - 3);

	}

//using memoization

	int countways1(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return countways(n, memo);
	}

	private int countways(int n, int[] memo) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;

		} else if (memo[n] > -1) {
			return memo[n];
		} else {
			memo[n] = countways(n - 1, memo) + countways(n - 2, memo) + countways(n - 3, memo);
		}
		return memo[n];
	}
}
