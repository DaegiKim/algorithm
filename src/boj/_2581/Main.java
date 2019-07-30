package boj._2581;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        BigInteger primeNumber = new BigInteger(String.valueOf(m-1)).nextProbablePrime();

        List<Integer> list = new ArrayList<>();

        while(primeNumber.intValue() <= n) {
            list.add(primeNumber.intValue());
            primeNumber = primeNumber.nextProbablePrime();
        }

        if(!list.isEmpty()) {
            IntSummaryStatistics statistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
            System.out.println(statistics.getSum());
            System.out.println(statistics.getMin());
        } else {
            System.out.println(-1);
        }

    }
}
