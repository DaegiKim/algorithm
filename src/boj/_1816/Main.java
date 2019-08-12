package boj._1816;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        List<Integer> primes = getPrimes();
        while (T-->0) {
            BigInteger num = new BigInteger(br.readLine());

            boolean isGood = true;
            for (Integer prime : primes) {
                if(num.remainder(BigInteger.valueOf(prime)).equals(BigInteger.ZERO)) {
                    isGood = false;
                    break;
                }
            }

            bw.write(isGood?"YES":"NO");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static List<Integer> getPrimes() {
        int[] arr = new int[1000001];

        for (int i = 2; i < 1000001; i++) {
            arr[i] = i;
        }

        double sqrt = Math.sqrt(1000001);
        for (int i = 2; i < sqrt; i++) {
            for (int j = i+i; j < 1000001; j+=i) {
                arr[j] = 0;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < 1000001; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
