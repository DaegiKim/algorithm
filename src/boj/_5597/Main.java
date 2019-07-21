package boj._5597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int index = scanner.nextInt();
            arr[index-1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1) {
                System.out.println(i+1);
            }
        }
    }
}
