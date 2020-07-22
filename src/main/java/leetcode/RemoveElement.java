package leetcode;

import java.util.stream.IntStream;

public class RemoveElement {
	public static void main(String[] args) {
		int[] input = { 3, 2, 2, 3 };
		int newLength = new RemoveElement().removeElement(input, 3);
		IntStream.range(0, newLength).forEach(index -> System.out.println(input[index]));
	}

	public int removeElement(int[] nums, int val) {
		int index = 0;
		for (int num : nums) {
			if (num != val) {
				nums[index] = num;
				index++;
			}
		}
		return index;
	}
}
