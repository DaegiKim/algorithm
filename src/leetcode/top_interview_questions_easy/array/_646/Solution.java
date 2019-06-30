package leetcode.top_interview_questions_easy.array._646;

public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        int temp;
        for (int i = 1; i <= k; i++) {
            temp = nums[nums.length-1];

            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }

            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {1,2,3,4,5};
        int k = 3;

        solution.rotate(arr, k);
    }
}
