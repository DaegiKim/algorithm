package boj._5618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int gcd = findGCD(arr, N);

        IntStream.rangeClosed(1, gcd).filter(a -> gcd % a == 0).forEach(System.out::println);
    }

    private static int gcd(int a, int b) {
        if (a==0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static int findGCD(int[] arr, int n) {
        int result = arr[0];
        for (int i = 0; i < n; i++) {
            result = gcd(arr[i], result);
        }
        return result;
    }
}
