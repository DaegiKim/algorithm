package boj._2490;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = {'E','A','B','C','D'};

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[solve(scanner.nextLine())]);
        }
    }

    private static int solve(String source) {
        long count = Arrays.stream(source.split("")).filter(s -> s.equals("0")).count();
        return Math.toIntExact(count);
    }
}
