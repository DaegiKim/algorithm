package boj._2960;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        System.out.println(getPrimes(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
    }

    private static int getPrimes(int N, int K) {
        int[] arr = new int[N+1];

        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        int count = 0;
        for (int i = 2; i <= N; i++) {
            if(arr[i] != 0 && ++count == K) {
                return arr[i];
            }
            for (int j = i+i; j <= N; j+=i) {
                if(arr[j] != 0 && ++count == K) {
                    return arr[j];
                }

                arr[j] = 0;
            }
        }

        return 0;
    }
}
