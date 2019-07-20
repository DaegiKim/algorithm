package boj._5565;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            total-=scanner.nextInt();
        }

        System.out.println(total);
    }
}
