package boj._10799;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        char prev = 0;
        int count = 0;
        for (Character c : chars) {
            if(c == '(') {
                stack.add(c);
            } else {
                stack.pop();
                if(prev=='(') {
                    count += stack.size();
                } else {
                    count += 1;
                }
            }
            prev = c;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
