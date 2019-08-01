package boj._7489;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0) {
            int n = scanner.nextInt();
            String str = IntStream.rangeClosed(1, n)
                    .mapToObj(BigInteger::valueOf)
                    .parallel()
                    .reduce(BigInteger::multiply).orElse(BigInteger.ZERO).toString();
            System.out.println(str.charAt(str.length()-1-countZero(n)));
        }
    }

    private static int countZero(int n) {
        final int FIVE = 5;
        final int result = n/FIVE;
        if(result>=FIVE) {
            return result + countZero(result);
        } else {
            return result;
        }
    }
}
