package leetcode.subarray_sum_equals_k;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {28,54,7,-70,22,65,-6};
        int k = 100;

        Solution solution = new Solution();
        System.out.println(solution.subarraySum(nums, k));
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
