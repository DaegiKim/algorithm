package boj._11720;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = scanner.next();
        String[] split = s.split("");

        int sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();

        System.out.println(sum);
    }
}
