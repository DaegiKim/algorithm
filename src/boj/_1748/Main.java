package boj._1748;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int source_len = String.valueOf(n).length();
        if(source_len==1) {
            System.out.println(n);
            return;
        }

        long length = 0;
        for (int i = 0; i < source_len-1; i++) {
            length += (9*Math.pow(10, i))*(i+1);
        }
        length += ((n+1) - Math.pow(10, source_len-1))*source_len;
        System.out.println(length);
    }
}
