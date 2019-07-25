package leetcode.keyboard_row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] arr = {"Hello", "Alaska", "Dad", "Peace"};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findWords(arr)));
    }

    public String[] findWords(String[] words) {
        String[] rows = {
                "QWERTYUIOP",
                "ASDFGHJKL",
                "ZXCVBNM"
        };

        List<String> result = new ArrayList<>();

        for(String word : words){
            String upperCase = word.toUpperCase();

            boolean match = true;

outer:      for(String row : rows) {
                String[] split = upperCase.split("");
                for (int i = 0; i < split.length; i++) {
                    if(!row.contains(split[i])) {
                        match = false;
                        break;
                    }
                    if(i == split.length-1) {
                        match = true;
                        break outer;
                    }
                }
            }

            if(match) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
