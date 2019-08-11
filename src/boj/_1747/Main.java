package boj._1747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> primes = getPrimes(1_000_000);

        int answer = 1003001;

        for (Integer prime : primes) {
            if(prime >= n && isPalindrome(prime)) {
                answer = prime;
                break;
            }
        }

        System.out.println(answer);
    }

    private static boolean isPalindrome(int n) {
        Deque<String> deque = new LinkedList<>(Arrays.asList(String.valueOf(n).split("")));

        boolean isPalindrome = true;
        while (deque.size()>1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
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
