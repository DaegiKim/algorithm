package boj._5586;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int joi_cnt = 0;
        int ioi_cnt = 0;

        for (int i = 0; i < s.length();) {
            int index = s.indexOf("JOI", i);
            if(index != -1) {
                i = index+3;
                joi_cnt++;
            } else {
                break;
            }
        }

        for (int i = 0; i < s.length();) {
            int index = s.indexOf("IOI", i);
            if(index != -1) {
                i = index+2;
                ioi_cnt++;
            } else {
                break;
            }
        }

        System.out.println(joi_cnt);
        System.out.println(ioi_cnt);
    }
}
