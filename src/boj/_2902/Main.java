package boj._2902;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("-");
        Arrays.stream(split).forEach(v -> {
            System.out.print(v.charAt(0));
        });
    }
}
