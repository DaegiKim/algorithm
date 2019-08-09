package boj._2752;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ")).mapToInt(Integer::valueOf).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
