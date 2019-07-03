package leetcode.longest_common_prefix;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }

        String longest = "";

        for(int i=1; i<=strs[0].length(); i++) {
            String prefix = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(prefix)) {
                    return longest;
                }
            }
            longest = prefix;
        }

        return longest;
    }

    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};

        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(arr));
    }
}
