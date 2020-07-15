package leetcode;

public class PowerOfFour {
	public static void main(String[] args) {
		boolean result = new PowerOfFour().isPowerOfFour(1);
		System.out.println(result);
		result = new PowerOfFour().isPowerOfFour(8);
		System.out.println(result);
	}

	public boolean isPowerOfFour(int num) {
		if (num == 0) {
			return false;
		}

		while (num != 1) {
			if (num % 4 != 0) {
				return false;
			}
			num /= 4;
		}

		return (num == 1);
	}

	public boolean isPowerOfFourUsingBitOperations(int num) {
		int count_z = 0;

		int x = num & (num - 1);
		if (num > 0 && x == 0) {
			while (num > 1) {
				num = num >> 1;
				count_z++;
			}
			return (count_z % 2 == 0);
		}

		return false;
	}

}
