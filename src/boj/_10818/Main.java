package boj._10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = scanner.nextInt();
        }

        System.out.print(Arrays.stream(arr).min().orElse(0));
        System.out.print(" ");
        System.out.print(Arrays.stream(arr).max().orElse(0));
    }
}
