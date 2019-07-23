package boj._10214;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            int y = 0;
            int k = 0;
            for (int j = 0; j < 9; j++) {
                y+=scanner.nextInt();
                k+=scanner.nextInt();
            }
            System.out.println(y>k?"Yonsei":y<k?"Korea":"Draw");
        }
    }
}
