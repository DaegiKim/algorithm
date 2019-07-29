package boj._17362;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int d = n/4;
        int r = n%4;

        if(r==3) {
            System.out.println(3);
        } else {
            if(r%2 == 0) {
                if(d%2==0) {
                    System.out.println(2);
                } else {
                    System.out.println(4);
                }
            } else {
                if(d%2==0) {
                    System.out.println(1);
                } else {
                    System.out.println(5);
                }
            }
        }
    }
}
