package boj._2407;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        BigInteger n = new BigInteger(s[0]);
        BigInteger m = new BigInteger(s[1]);
        bw.write(combinations(n, m).toString());
        bw.flush();
        bw.close();
    }

    private static BigInteger combinations(BigInteger n, BigInteger m) {
        BigInteger a = getFact(n);
        BigInteger b = getFact(n.add(m.negate()));
        BigInteger c = getFact(m);
        return a.divide((b.multiply(c)));
    }

    private static BigInteger getFact(BigInteger n) {
        BigInteger f = BigInteger.ONE;
        int i = n.intValue();

        while(i > 0) {
            f = f.multiply(BigInteger.valueOf(i));
            i--;
        }

        return f;
    }
}
