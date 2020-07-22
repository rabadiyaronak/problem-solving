package leetcode;

import java.util.Arrays;

public class MovesZero {

	public static void main(String[] args) {
//		int[] inputs = { 0, 1, 0, 3, 12 };
		int[] inputs = { 0, 0 };
		new MovesZero().moveZeroes(inputs);
		System.out.println(Arrays.toString(inputs));
	}

	public void moveZeroes(int[] nums) {
		int index = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[index] = num;
				index++;
			}
		}
		if (index == 0) {
			return;
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

}
