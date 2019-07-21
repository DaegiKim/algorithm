package boj._5596;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        for (int i = 0; i < 8; i++) {
            if(i<4) {
                a+=scanner.nextInt();
            } else {
                b+=scanner.nextInt();
            }
        }

        System.out.println(b>a?b:a);
    }
}
