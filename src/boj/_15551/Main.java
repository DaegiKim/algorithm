package boj._15551;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = IntStream.range(0, scanner.nextInt() - 2).mapToObj(x->"-").reduce(String::concat).orElse("");
        String a = "Aa";
        String b = "BB";
        System.out.println(s+a);
        System.out.println(s+b);
    }
}