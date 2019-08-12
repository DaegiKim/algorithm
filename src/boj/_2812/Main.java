package boj._2812;

import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        int k = Integer.parseInt(split[1]);

        char[] chars = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        stack.push(chars[0]);

        int length = chars.length;
        for (int i = 1; i < length; i++) {
            char num = chars[i];
            while (k>0 && stack.peek() < num) {
                stack.pop();
                k--;
                if(stack.isEmpty()) break;
            }
            stack.push(num);
        }

        if(k>0) {
            for (Character character : stack.subList(0, stack.size() - k)) {
                bw.write(character);
            }
        } else {
            for (Character character : stack) {
                bw.write(character);
            }
        }

        bw.flush();
        bw.close();
    }
}
