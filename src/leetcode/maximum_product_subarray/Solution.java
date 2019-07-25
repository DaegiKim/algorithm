package leetcode.maximum_product_subarray;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
//        int[] arr = {-2,0,-1};
//        int[] arr = {-2};

        Solution solution = new Solution();

        System.out.println(solution.maxProduct(arr));
    }


    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int calc = 1;
            for (int j = i; j < nums.length; j++) {
                calc *= nums[j];
                if(calc>max) {
                    max = calc;
                }
            }
        }

        return max;
    }
}
