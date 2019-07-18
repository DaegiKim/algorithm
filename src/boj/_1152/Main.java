package boj._1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.trim();
        String[] s1 = s.split(" ");

        if(s1[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(s1.length);
        }
    }
}
