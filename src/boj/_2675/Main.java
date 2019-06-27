package boj._2675;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int times = scanner.nextInt();
            String s = scanner.next();
            String[] split = s.split("");
            Arrays.stream(split).forEach(v -> {
                for (int j = 0; j < times; j++) {
                    System.out.print(v);
                }
            });

            System.out.println();
        }
    }
}
