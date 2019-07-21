package boj._3986;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String[] split = scanner.nextLine().split("");
            Stack<String> stack = new Stack<>();
            stack.push(split[0]);
            for (int j = 1; j < split.length; j++) {
                if(!stack.empty() && stack.peek().equals(split[j])) {
                    stack.pop();
                } else {
                    stack.push(split[j]);
                }
            }

            if(stack.empty()) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
