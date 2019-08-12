package boj._15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int L = Integer.parseInt(br.readLine());
        final char[] chars = br.readLine().toCharArray();
        final long divider = 1234567891;

        long pow = 1;
        long hash = 0;

        for (int i = 0; i < L; i++) {
            if (i>=1) {
                pow *= 31;
                pow %= divider;
            }

            int h = chars[i] - 96;
            hash += (h * pow) % divider;
        }

        System.out.println(hash % divider);
    }
}
