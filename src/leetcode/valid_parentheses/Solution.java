package leetcode.valid_parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) {
            return true;
        }
        else if(s.length() % 2 != 0) {
            return false;
        }

        Stack<String> stack = new Stack<>();

        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            String bracket = split[i];
            if(bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                stack.push(bracket);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    if(bracket.equals(")") && !stack.pop().equals("(")) {
                        return false;
                    }
                    else if(bracket.equals("}") && !stack.pop().equals("{")) {
                        return false;
                    }
                    else if(bracket.equals("]") && !stack.pop().equals("[")) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()[]{}"));
    }
}
