package boj._1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double arr[] = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        double max = Arrays.stream(arr).max().getAsDouble();

        double sum = 0;

        for(double i : arr) {
            sum+=i/(max)*(double)100;
        }

        System.out.println(sum/n);
    }
}
