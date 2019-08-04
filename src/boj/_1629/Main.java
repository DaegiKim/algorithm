package boj._1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    private static final BigInteger TWO = BigInteger.valueOf(2);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        BigInteger a = new BigInteger(split[0]);
        BigInteger b = new BigInteger(split[1]);
        BigInteger c = new BigInteger(split[2]);

        System.out.println(pow(a, b, c).toString());
    }

    private static BigInteger pow(BigInteger a, BigInteger b, BigInteger c) {
        if(b.equals(BigInteger.ONE)) {
            return a.remainder(c);
        } else if(b.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else if(b.remainder(TWO).equals(BigInteger.ZERO)) {
            BigInteger n = pow(a, b.divide(TWO) , c);
            return n.pow(2).remainder(c);
        } else {
            BigInteger n = pow(a, b.add(BigInteger.ONE.negate()).divide(TWO), c);
            return a.multiply(n.pow(2).remainder(c)).remainder(c);
        }
    }
}
