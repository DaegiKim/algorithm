package leetcode.largest_number_at_least_twice_of_others;

import java.util.Arrays;

public class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) {
            return 0;
        } else if(nums.length == 2) {
            return nums[0]>nums[1]?0:1;
        }

        int max_index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=nums[max_index]) {
                max_index = i;
            }
        }

        int max = nums[max_index];
        nums[max_index] = -1;

        boolean present = Arrays.stream(nums).filter(i -> i * 2 > max).findFirst().isPresent();

        return present ? -1:max_index;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {3, 0, 0, 2};

        System.out.println(solution.dominantIndex(arr));
    }
}
