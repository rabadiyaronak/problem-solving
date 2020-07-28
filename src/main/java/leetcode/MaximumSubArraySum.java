package leetcode;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int result = new MaximumSubArraySum().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(result);

    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dpSum = new int[nums.length];
        int maxSum = nums[0];
        dpSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dpSum[i] = Math.max(dpSum[i - 1] + nums[i], nums[i]);
        }

        for (int sum : dpSum) {
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

}
