package boj._7789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        BigInteger b1 = new BigInteger(split[0]);
        BigInteger b2 = new BigInteger(split[1]+split[0]);

        System.out.println(b1.isProbablePrime(5) && b2.isProbablePrime(5) ? "Yes" : "No");
    }
}
