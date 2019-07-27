package hackerrank.java_2d_array;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(calc(arr));

        scanner.close();
    }

    static int calc(int[][] arr) {
        int n = arr.length;
        int size = 3;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - size; i++) {
            for (int j = 0; j <= n - size; j++) {
                int sum = sum(arr, i, j, size);
                if(sum>max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    static int sum(int[][] arr, int startRow, int startCol, int size) {
        int sum = 0;
        for (int i = startRow; i < startRow+size; i++) {
            for (int j = startCol; j < startCol+size; j++) {
                if (i != startRow + 1 || (j != startCol && j != startCol + 2)) {
                    sum+=arr[i][j];
                }
            }
        }

        return sum;
    }
}