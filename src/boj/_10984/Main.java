package boj._10984;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            solve(n, scanner);
        }
    }

    private static void solve(int n, Scanner scanner) {
        double sum = 0;
        double gpa = 0;
        for (int i = 0; i < n; i++) {
            double s = scanner.nextDouble();
            double g = scanner.nextDouble();
            sum += s;
            gpa += s*g;
        }

        System.out.printf("%.0f %.1f\n", sum, gpa/sum);
    }
}
