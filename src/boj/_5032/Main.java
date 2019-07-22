package boj._5032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = e+f;
        int cnt = 0;

        while(sum >= c) {
            cnt += sum/c;
            sum = sum % c + sum / c;
        }

        System.out.println(cnt);
    }
}