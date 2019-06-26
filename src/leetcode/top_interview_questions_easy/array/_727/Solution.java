package leetcode.top_interview_questions_easy.array._727;

class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]!=nums[i-1]) {
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}
