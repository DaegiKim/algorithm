package boj._11772;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger sum = BigInteger.ZERO;

        while (N-->0) {
            BigInteger value = new BigInteger(br.readLine());
            sum = sum.add(value.divide(BigInteger.TEN).pow(value.remainder(BigInteger.TEN).intValue()));
        }

        System.out.println(sum.toString());
    }
}
