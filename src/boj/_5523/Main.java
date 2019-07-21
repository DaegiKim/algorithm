package boj._5523;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int winA = 0;
        int winB = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a>b) {
                winA++;
            } else if(b>a) {
                winB++;
            }
        }

        System.out.printf("%d %d", winA, winB);
    }
}
