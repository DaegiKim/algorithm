package leetcode.sqrtx;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(8));
    }

    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int)sqrt;
    }
}
