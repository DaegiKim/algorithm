package boj._14490;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] split = s.split(":");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int gcd = gcd(n, m);

        System.out.printf("%d:%d", n/gcd, m/gcd);
    }


    private static int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
