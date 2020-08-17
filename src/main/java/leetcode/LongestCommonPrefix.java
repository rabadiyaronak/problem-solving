package leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] input = { "flower", "flow", "flight" };
		String output = new LongestCommonPrefix().longestCommonPrefix(input);
		System.out.println(output);
	}

	public String longestCommonPrefix(String[] strs) {
		StringBuilder longestPrefix = new StringBuilder("");
		String minString = strs[0];
		String maxString = strs[0];

		for (String str : strs) {
			if (minString.compareTo(str) > 0) {
				minString = str;
			}

			if (maxString.compareTo(str) < 0) {
				maxString = str;
			}
		}

		if (minString.length() == 0) {
			return "";
		}

		for (int i = 0; i < minString.length(); i++) {
			if (minString.charAt(i) != maxString.charAt(i)) {
				break;
			}
			longestPrefix.append(minString.charAt(i));
		}

		return longestPrefix.toString();
	}

}
