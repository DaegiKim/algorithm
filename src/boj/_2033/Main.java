package boj._2033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int boundary_len = 1;

        while(boundary_len<9) {
            double boundary = Math.pow(10, boundary_len);

            if(n>boundary) {
                n = (int) (Math.round(n / boundary) * boundary);
            }

            boundary_len++;
        }

        System.out.println(n);
    }
}
