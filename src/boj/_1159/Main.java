package boj._1159;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[27];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            char c = s.charAt(0);
            arr[c-97] = arr[c-97] + 1;
        }

        long count = Arrays.stream(arr).filter(i -> i >= 5).count();

        if(count==0) {
            System.out.println("PREDAJA");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= 5) {
                    System.out.print((char) (i + 97));
                }
            }
        }
    }
}
