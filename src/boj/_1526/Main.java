package boj._1526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        if(4 <= N) queue.add((answer = 4));
        if(7 <= N) queue.add((answer = 7));

        while (!queue.isEmpty()) {
            int num = queue.poll();
            num *= 10;
            if(num+4 <= N) queue.add(answer = num+4);
            if(num+7 <= N) queue.add(answer = num+7);
        }

        System.out.println(answer);
    }
}
