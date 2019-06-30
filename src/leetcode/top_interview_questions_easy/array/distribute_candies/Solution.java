package leetcode.top_interview_questions_easy.array.distribute_candies;

import java.util.Arrays;

public class Solution {
    public int distributeCandies(int[] candies) {
        long count = Arrays.stream(candies).distinct().count();
        return (int) Math.min(count, candies.length/2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {1,1,2,3};
        System.out.println(solution.distributeCandies(arr));;
    }
}
