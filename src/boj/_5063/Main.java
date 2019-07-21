package boj._5063;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            int e = scanner.nextInt();
            int c = scanner.nextInt();

            int sol = e-c;

            if(r==sol) {
                System.out.println("does not matter");
            } else if(r>sol) {
                System.out.println("do not advertise");
            } else {
                System.out.println("advertise");
            }
        }
    }
}
