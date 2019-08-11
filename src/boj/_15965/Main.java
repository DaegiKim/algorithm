package boj._15965;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        List<Integer> primes = getPrimes(7370000);

        System.out.println(primes.get(k-1));
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
