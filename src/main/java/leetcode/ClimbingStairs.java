package leetcode;

public class ClimbingStairs {

	public static void main(String[] args) {
		int result = new ClimbingStairs().climbStairs(4);
		System.out.println(result);
	}

	public int climbStairs(int n) {
		int[] track = new int[n + 1];
		track[0] = 1;
		track[1] = 1;

		for (int i = 2; i <= n; i++) {
			track[i] = track[i - 1] + track[i - 2];
		}

		return track[n];
	}

}
