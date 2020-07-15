package leetcode;

//Using Kernighan's Algorithm
public class NumberOf1BitSet {

	public static void main(String[] args) {
		int result = new NumberOf1BitSet().hammingWeight(128);
		System.out.println(result);
	}

	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}

		return count;
	}
}
