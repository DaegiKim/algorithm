package programmers._12904;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("abcdcba");
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;

        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                String substr = s.substring(j, length-i+j);
                if(isPalindrome(substr)) {
                    answer = substr.length();
                    return answer;
                }
            }
        }

        return answer;
    }

    private boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}