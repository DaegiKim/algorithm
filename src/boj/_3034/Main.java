package boj._3034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double w = scanner.nextInt();
        double h = scanner.nextInt();
        double diagonal = Math.sqrt(Math.pow(w,2)+Math.pow(h,2));

        for (int i = 0; i < n; i++) {
            if(scanner.nextDouble()<=diagonal) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
