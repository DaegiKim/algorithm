package boj._2061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        BigInteger P = new BigInteger(split[0]);
        List<Integer> primes = getPrimes(Integer.parseInt(split[1]));

        boolean isGood = true;
        int answer = 0;

        for (Integer prime : primes) {
            if(P.remainder(BigInteger.valueOf(prime)).equals(BigInteger.ZERO)) {
                answer = prime;
                isGood = false;
                break;
            }
        }

        System.out.println(isGood?"GOOD":"BAD "+answer);
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