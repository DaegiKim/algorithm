package boj._5532;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double D = scanner.nextDouble();

        int ac = (int) Math.ceil(A/C);
        int bd = (int) Math.ceil(B/D);


        int max = Math.max(ac,bd);

        System.out.println(L-max);
    }
}
