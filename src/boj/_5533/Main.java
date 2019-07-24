package boj._5533;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] arr = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                if(isUnique(arr, i, j, N, arr[i][j])) {
                    sum+=arr[i][j];
                }
            }
            System.out.println(sum);
        }
    }

    private static boolean isUnique(int[][] arr, int i, int j, int N, int num) {
        for (int k = 0; k < N; k++) {
            if(k!=i && num == arr[k][j]) {
                return false;
            }
        }
        return true;
    }
}
