package hackerrank._2d_array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int hourglassSum(int[][] arr) {
        int size = arr.length;

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<size-2; i++) {
            for(int j=0; j<size-2; j++) {
                largest = Math.max(largest, getSum(arr, i, j));
            }
        }

        return largest;
    }

    static int getSum(int[][] arr, int x, int y) {
        int sum = arr[x][y];
        sum += arr[x][y+1];
        sum += arr[x][y+2];
        sum += arr[x+1][y+1];
        sum += arr[x+2][y];
        sum += arr[x+2][y+1];
        sum += arr[x+2][y+2];

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        scanner.close();
    }
}
