package boj._5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        int sum = 0;
        for(char c : chars) {
            int ascii = c;

            if(ascii>='A' && ascii<='C') {
                sum+=2;
            } else if(ascii>='D' && ascii<='F') {
                sum+=3;
            } else if(ascii>='G' && ascii<='I') {
                sum+=4;
            } else if(ascii>='J' && ascii<='L') {
                sum+=5;
            } else if(ascii>='M' && ascii<='O') {
                sum+=6;
            } else if(ascii>='P' && ascii<='S') {
                sum+=7;
            } else if(ascii>='T' && ascii<='V') {
                sum+=8;
            } else if(ascii>='W' && ascii<='Z') {
                sum+=9;
            }
        }

        System.out.println(sum+s.length());
    }
}
