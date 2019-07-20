package boj._2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[100][100];

        for (int i = 0; i < n; i++) {
            String[] s = scanner.nextLine().split(" ");
            fill(arr, Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    private static void fill(int[][] arr, int x, int y) {
        for (int i = x; i < x+10; i++) {
            for (int j = y; j < y+10; j++) {
                arr[i][j] = 1;
            }
        }
    }
}
