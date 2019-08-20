package programmers._29864;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("a B z", 4));
    }
}

class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += n;
                if(chars[i] > 'Z') {
                    chars[i] %= 'Z';
                    chars[i] += ('A' - 1);
                }
            }
            else if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] += n;
                if(chars[i] > 'z') {
                    chars[i] %= 'z';
                    chars[i] += ('a' - 1);
                }
            }
        }

        String answer = new String(chars);
        return answer;
    }
}