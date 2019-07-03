package leetcode.reverse_integer;

public class Solution {
    public int reverse(int x) {
        try {
            boolean isNegative = x<0;

            String s = String.valueOf(Math.abs(x));
            StringBuilder sb = new StringBuilder(s);

            int i = Integer.parseInt(sb.reverse().toString());

            return isNegative?(-i):i;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
    }
}
