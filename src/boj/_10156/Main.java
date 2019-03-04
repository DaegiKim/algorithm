package boj._10156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = a*b - c;

        if(result>0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
