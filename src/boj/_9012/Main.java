package boj._9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            System.out.println(solve(input)?"YES":"NO");
        }
    }

    private static boolean solve(String input) {
        Stack<String> stack = new Stack<>();
        String[] split = input.split("");

        for (String c : split) {
            if (c.equals("(")) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (!stack.pop().equals("(")) return false;
            }
        }
        return stack.isEmpty();
    }
}
