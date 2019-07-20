package boj._11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int cnt = 0;

        for (int i = n-1; i >=  0; i--) {
            if(k == 0) {
                break;
            }
            cnt += k/arr[i];
            k = k%arr[i];
        }

        System.out.println(cnt);
    }
}
