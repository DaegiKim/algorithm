package boj._1564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long divider = 1000000000000L;

        long result = 1L;
        for (int i = n; i >= 1; i--) {
            result = result * i;
            while (result%10==0) {
                result = result/10;
            }
            result = result%divider;
        }

        System.out.print(String.format("%05d", result%100000));
    }
}
