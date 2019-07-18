package boj._2864;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int minA = Integer.parseInt(String.valueOf(a).replaceAll("6", "5"));
        int minB = Integer.parseInt(String.valueOf(b).replaceAll("6", "5"));
        int maxA = Integer.parseInt(String.valueOf(a).replaceAll("5", "6"));
        int maxB = Integer.parseInt(String.valueOf(b).replaceAll("5", "6"));

        System.out.printf("%d %d", minA+minB, maxA+maxB);
    }
}
