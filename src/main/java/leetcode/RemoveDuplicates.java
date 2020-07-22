package leetcode;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		int newLength = new RemoveDuplicates().removeDuplicates(nums);
		for (int i = 0; i < newLength; i++) {
			System.out.println(nums[i]);
		}
	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int index = 0;
		int i = 0;
		for (; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[index] = nums[i];
				index++;
			}
		}
		nums[index] = nums[i];
		index++;
		return index;
	}
}
