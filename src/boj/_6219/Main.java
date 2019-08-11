package boj._6219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int d = Integer.parseInt(split[2]);
        String strD = String.valueOf(d);

        List<Integer> primes = getPrimes(b);

        int count = 0;

        for (Integer prime : primes) {
            if(prime>=a && String.valueOf(prime).contains(strD)) {
                count++;
            }
        }

        System.out.println(count);
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
