package leetcode;

public class PowToXN {
	public static void main(String[] args) {
		double result = new PowToXN().myPow(2.00000, 10);
		double result1 = new PowToXN().myPow(2.00000, -2);
		double result2 = new PowToXN().myPow(-2.00000, 2);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

	public double myPow(double x, int n) {
		int sign = 1;
		if (x < 0 && (n % 2 != 0)) {
			sign = -1;
		}
		x = Math.abs(x);

		double lny = n * Math.log(x);
		double y = Math.exp(lny);

		return y * sign;
	}
}

