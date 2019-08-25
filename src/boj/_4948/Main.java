package boj._4948;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while (!(line = br.readLine()).equals("0")) {
            int k = Integer.parseInt(line);

            List<Integer> primes = getPrimes(2 * k);

            long count = primes.stream().filter(x -> x > k && x <= 2 * k).count();

            if(k==1) count = 1;

            bw.write(String.valueOf(count));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static List<Integer> getPrimes(int K) {
        int[] arr = new int[K];

        for (int i = 2; i < K; i++) {
            arr[i] = i;
        }

        double sqrt = Math.sqrt(K);
        for (int i = 2; i < sqrt; i++) {
            for (int j = i+i; j < K; j+=i) {
                arr[j] = 0;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < K; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
