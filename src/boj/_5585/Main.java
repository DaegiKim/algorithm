package boj._5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int change = 1000-i;
        int count = 0;

        int[] arr = {500, 100, 50, 10, 5, 1};

        for (int j = 0; j < arr.length; j++) {
            count += change/arr[j];
            change = change%arr[j];
        }

        System.out.println(count);
    }
}
