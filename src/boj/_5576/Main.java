package boj._5576;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] w = new int[10];
        int[] k = new int[10];

        for (int i = 0; i < 10; i++) {
            w[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            k[i] = scanner.nextInt();
        }

        System.out.printf("%d %d", Arrays.stream(w).sorted().skip(7).sum(), Arrays.stream(k).sorted().skip(7).sum());
    }
}
