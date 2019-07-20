package boj._2804;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();

        int s1_len = s1.length();
        int s2_len = s2.length();

        int s1_pos = -1;
        int s2_pos = -1;

outer:  for (int i = 0; i < s1_len; i++) {
            for (int j = 0; j < s2_len; j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    s1_pos = i;
                    s2_pos = j;
                    break outer;
                }
            }
        }

        for (int j = 0; j < s2_len; j++) {
            for (int i = 0; i < s1_len; i++) {
                if(i == s1_pos) {
                    System.out.print(s2.charAt(j));
                }
                else if(j == s2_pos) {
                    System.out.print(s1.charAt(i));
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
