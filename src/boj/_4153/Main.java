package boj._4153;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double[] arr = new double[3];
            arr[0] = Math.pow(scanner.nextDouble(), 2);
            arr[1] = Math.pow(scanner.nextDouble(), 2);
            arr[2] = Math.pow(scanner.nextDouble(), 2);

            if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
                break;
            }

            Arrays.sort(arr);

            System.out.println(arr[2]==arr[0]+arr[1]?"right":"wrong");
        }
    }
}
