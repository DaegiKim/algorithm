package boj._5397;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            Deque<Character> deque1 = new LinkedList<>();
            Deque<Character> deque2 = new LinkedList<>();

            char[] chars = br.readLine().toCharArray();

            for (char aChar : chars) {
                switch(aChar) {
                    case '<':
                        if(!deque2.isEmpty()) {
                            deque1.push(deque2.pop());
                        }
                        break;
                    case '>':
                        if(!deque1.isEmpty()) {
                            deque2.push(deque1.pop());
                        }
                        break;
                    case '-':
                        if(!deque2.isEmpty()) {
                            deque2.pop();
                        }
                        break;
                    default:
                        deque2.push(aChar);
                        break;
                }
            }

            int size = deque1.size();
            while(size-->0) {
                deque2.push(deque1.pop());
            }

            StringBuilder sb = new StringBuilder();
            deque2.descendingIterator().forEachRemaining(sb::append);

            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}