package leetcode;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int result = new MaximumProductSubArray().maxProduct(new int[] {2,3,-2,4});
        System.out.println(result);
        result = new MaximumProductSubArray().maxProduct(new int[] {2,3,-2,-4});
        System.out.println(result);
        result = new MaximumProductSubArray().maxProduct(new int[] {-2,0,-1});
        System.out.println(result);

    }

    public int maxProduct(int[] nums) {
        int max_product = Integer.MIN_VALUE;
        int product = 1;

        for (int i = 0; i < nums.length ; i++) {
            product *= nums[i] ;
            max_product = Math.max(max_product,product);
            if(product == 0){
                product =1;
            }
        }

        product = 1 ;
        for (int i = nums.length-1; i >= 0 ; i--) {
            product *= nums[i] ;
            max_product = Math.max(max_product,product);
            if(product == 0){
                product =1;
            }
        }


        return max_product;
    }
}
