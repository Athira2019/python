//Check permutation page 143
public class permutationString {
	//solution 1
	String sort(String s) {
		char[] c = s.toCharArray();
		java.util.Arrays.parallelSort(c);
		return new String(c);
	}

	public boolean isPermutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	// solution 2:
	boolean isPermutation2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] charSet = new int[128];

		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			charSet[c]++;
		}

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			charSet[c]--;
			if (charSet[c] < 0) {
				return false;
			}
		}
		return true;

	}
}
