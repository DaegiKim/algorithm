package boj._10953;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] split = s.split(",");

            System.out.println(Integer.parseInt(split[0]) + Integer.parseInt(split[1]));
        }
    }
}
