package boj._1929;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        int m = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);

        List<Integer> primes = getPrimes(n);
        StringBuilder sb = new StringBuilder();
        for (Integer prime : primes) {
            if(prime>=m) {
                sb.append(prime);
                sb.append('\n');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static List<Integer> getPrimes(int K) {
        int[] arr = new int[K+1];

        for (int i = 2; i <= K; i++) {
            arr[i] = i;
        }

        double sqrt = Math.sqrt(K);
        for (int i = 2; i <= sqrt; i++) {
            for (int j = i+i; j <= K; j+=i) {
                arr[j] = 0;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= K; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
