package boj._1978;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.format("%d", Arrays.stream(br.readLine().split(" ")).map(BigInteger::new).filter(x -> x.isProbablePrime(2)).count()));
        bw.flush();
        bw.close();
    }
}
