package boj._10707;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int P = scanner.nextInt();

        int priceX = P*A;
        int priceY = B+(P>C?(P-C)*D:0);

        System.out.println(Math.min(priceX, priceY));
    }
}
