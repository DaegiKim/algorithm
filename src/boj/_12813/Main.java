package boj._12813;

import java.io.*;
import java.math.BigInteger;

public class Main {
    private static final int MAX_LEN = 100_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();

        BigInteger a = new BigInteger(first, 2);
        BigInteger b = new BigInteger(second, 2);

        BigInteger MASK = BigInteger.ONE.shiftLeft(MAX_LEN).subtract(BigInteger.ONE);

        System.out.println(formatter(a.and(b)));
        System.out.println(formatter(a.or(b)));
        System.out.println(formatter(a.xor(b)));
        System.out.println(formatter(a.xor(MASK)));
        System.out.println(formatter(b.xor(MASK)));
    }

    private static String formatter(BigInteger bigInteger) {
        String binaryStr;
        binaryStr = String.format("%"+MAX_LEN+"s", bigInteger.toString(2));
        binaryStr = binaryStr.replace(' ','0');
        binaryStr = binaryStr.length()>MAX_LEN ? binaryStr.substring(binaryStr.length()-MAX_LEN) : binaryStr;
        return binaryStr;
    }
}
