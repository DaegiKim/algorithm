package boj._10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> deque = new LinkedList<>(Arrays.asList(br.readLine().split("")));

        boolean isNotPalindrome = IntStream.range(0, deque.size() / 2)
                .anyMatch(x -> !deque.removeFirst().equals(deque.removeLast()));

        System.out.println(isNotPalindrome?"0":"1");
    }
}
