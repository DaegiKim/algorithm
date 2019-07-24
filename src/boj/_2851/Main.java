package boj._2851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = 10;
        int target = 100;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int solution = 0;

        for (int i = 0; i <= N; i++) {
            int sum = Arrays.stream(arr).limit(i).sum();

            int abs1 = Math.abs(sum - target);
            int abs2 = Math.abs(solution - target);

            if(abs1 == abs2) {
                solution = Math.max(sum, solution);
            } else {
                if(abs1<abs2) {
                    solution = sum;
                }
            }
        }

        System.out.println(solution);
    }
}
