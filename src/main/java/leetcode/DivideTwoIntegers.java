package leetcode;

public class DivideTwoIntegers {
	public static void main(String[] args) {
		int result = new DivideTwoIntegers().divide(-2147483648, -1);
		System.out.println(result);
		result = new DivideTwoIntegers().divide(10, 3);
		System.out.println(result);
		result = new DivideTwoIntegers().divide(7, -3);
		System.out.println(result);
		result = new DivideTwoIntegers().divide(-1, 1);
		System.out.println(result);
		result = new DivideTwoIntegers().divide(-2147483648, 2);
		System.out.println(result);
		// -2147483648
//		-1
	}

	public int divide(int dividend, int divisor) {

		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}

		if (dividend == Integer.MIN_VALUE && divisor == 1) {
			return Integer.MIN_VALUE;
		}

		int sign = 1;
		int count = 0;
		if (dividend < 0 && divisor < 0) {
			sign = 1;
		} else if (dividend < 0 || divisor < 0) {
			sign = -1;

		}

		dividend = dividend > 0 ? dividend : -dividend;
		divisor = divisor > 0 ? divisor : -divisor;

		while (dividend >= divisor) {
			dividend -= divisor;
			count++;
		}

		if (sign < 0) {
			count = -count;
		}
		return count;


	}
}
