package leetcode;

public class PowerOfThree {
	public static void main(String[] args) {
		boolean result;
		result = new PowerOfThree().isPowerOfThree(1);
		System.out.println(result);
		result = new PowerOfThree().isPowerOfThree(3);
		System.out.println(result);
		result = new PowerOfThree().isPowerOfThree(9);
		System.out.println(result);
		result = new PowerOfThree().isPowerOfThree(27);
		System.out.println(result);
	}

	public boolean isPowerOfThree(int n) {
		if ((n & 1) == 1) {
			double pow = 1;
			while (pow < n) {
				pow = pow * 3;
			}
			return pow == n;
		}
		return false;

	}
}
