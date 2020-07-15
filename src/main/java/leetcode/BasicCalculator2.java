package leetcode;

import java.util.Stack;

public class BasicCalculator2 {
	public static void main(String[] args) {
//		String input = "3+2*2";
		String input = " 3/2 ";
		int result = new BasicCalculator2().calculate(input);
		System.out.println(result);
	}

	public int calculate(String s) {
		Stack<Integer> evalStack = new Stack<>();
		char[] chars = s.trim().toCharArray();
		int num = 0;
		char sign = '+';

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				continue;
			}

			if (Character.isDigit(chars[i])) {
				num = num * 10 + (chars[i] - 48);
			}

			if (i + 1 == chars.length || chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') {

				if (sign == '+') {
					evalStack.push(num);
				} else if (sign == '-') {
					evalStack.push(-num);
				} else if (sign == '*') {
					int val = num * evalStack.pop();
					evalStack.add(val);

				} else if (sign == '/') {
					int val = evalStack.pop() / num;
					evalStack.add(val);
				}

				sign = chars[i];
				num = 0;
			}
		}

		int result = 0;
		for (int i : evalStack) {
			result += i;
		}

		return result;
	}
}
