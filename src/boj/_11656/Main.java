package boj._11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        IntStream.range(0, input.length())
                .boxed()
                .map(input::substring)
                .sorted()
                .forEach(System.out::println);
    }
}
