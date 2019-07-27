package hackerrank.java_biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger i1 = new BigInteger(scanner.next());
        BigInteger i2 = new BigInteger(scanner.next());

        System.out.println(i1.add(i2).toString());
        System.out.println(i1.multiply(i2).toString());
    }
}
