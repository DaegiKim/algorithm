package leetcode.palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        String s  = String.valueOf(x);
        String[] split = s.split("");

        int l = 0;
        int r = split.length-1;

        while (l<r) {
            if(!split[l].equals(split[r])) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(131));
    }
}
