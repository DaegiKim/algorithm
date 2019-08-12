package boj._1124;

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

        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);

        int count = 0;
        for (int i = A; i <= B; i++) {
            List<Integer> integers = primeFactors(i);
            if(BigInteger.valueOf(integers.size()).isProbablePrime(10)) count++;
        }

        System.out.println(count);
    }

    private static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
