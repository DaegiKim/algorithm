package boj._10798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 5;
        int col = 15;

        char[][] arr = new char[row][col];

        for (int i = 0; i < row; i++) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            for (int j = 0; j < col; j++) {
                if (j < chars.length) {
                    arr[i][j] = chars[j];
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(arr[j][i] != Character.MIN_VALUE) {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
