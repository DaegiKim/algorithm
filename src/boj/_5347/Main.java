package boj._5347;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            String[] split = br.readLine().split(" ");
            BigInteger a = new BigInteger(split[0]);
            BigInteger b = new BigInteger(split[1]);
            bw.write(String.valueOf(a.multiply(b).divide(a.gcd(b))));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
