package boj._10569;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        while(T-->0) {
            int V = scanner.nextInt();
            int E = scanner.nextInt();

            System.out.println(E-V+2);
        }
    }
}
