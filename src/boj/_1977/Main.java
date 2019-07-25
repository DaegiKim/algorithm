package boj._1977;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        AtomicInteger sum = new AtomicInteger();
        final int[] min = {Integer.MAX_VALUE};

        IntStream.rangeClosed(1, 100)
                .map(i -> i * i)
                .filter(i -> i >= M && i <= N)
                .forEach(i -> {
                    if(i< min[0]) {
                        min[0] = i;
                    }
                    sum.addAndGet(i);
                });

        if(sum.get() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum.get());
            System.out.println(min[0]);
        }

    }
}
