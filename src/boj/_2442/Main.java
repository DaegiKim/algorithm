package boj._2442;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int length = n-i-1 + (2*(i+1)-1);
            System.out.printf("%"+length+"s\n", IntStream.range(0, (2*(i+1)-1)).mapToObj(a->"*").reduce(String::concat).orElse(""));
        }
    }
}
