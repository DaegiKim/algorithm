package boj._8974;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int sum = IntStream.rangeClosed(1, 45).mapToObj(x -> {
            List<Integer> list = new ArrayList<>(x);
            for (int i = 0; i < x; i++) {
                list.add(x);
            }
            return list;
        })
                .flatMap(Collection::stream)
                .skip(n - 1)
                .limit(m - n + 1)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
