package boj._11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int prev = 0;
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sum += (arr[i]+prev);
            prev = arr[i]+prev;
        }

        System.out.println(sum);
    }
}
