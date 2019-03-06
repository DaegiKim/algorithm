package boj._2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());
        int n2 = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());

        System.out.println(n1>n2?n1:n2);
    }
}
