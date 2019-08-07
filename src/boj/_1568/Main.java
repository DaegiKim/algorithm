package boj._1568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int seconds = 0;
        int k = 1;
        while(n>0) {
            if(n>=k) {
                n -= k++;
            } else {
                k=1;
                n -= k++;
            }

            seconds++;
        }
        System.out.println(seconds);
    }
}
