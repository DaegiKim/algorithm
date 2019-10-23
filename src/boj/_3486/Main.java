package boj._3486;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-->0) {
            String line = br.readLine();
            String[] split = line.split(" ");

            int left = Integer.parseInt(reverse(split[0]));
            int right = Integer.parseInt(reverse(split[1]));

            int sum = left+right;
            String reversedSum = reverse(String.valueOf(sum));
            System.out.println(Integer.parseInt(reversedSum));
        }
    }

    private static String reverse(String source) {
        return new StringBuilder(source).reverse().toString();
    }
}
