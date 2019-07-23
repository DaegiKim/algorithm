package boj._2455;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 4;
        int MAXIMUM = 10000;

        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int out = scanner.nextInt();
            int in = scanner.nextInt();

            count -= out;
            count += in;
            count %= MAXIMUM;

            if(count>max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
