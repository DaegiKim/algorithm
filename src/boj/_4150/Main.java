package boj._4150;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger temp;

        n-=2;

        while (n-->0) {
            temp = b;
            b = a.add(b);
            a = temp;
        }

        System.out.println(b);
    }
}
